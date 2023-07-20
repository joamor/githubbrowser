package com.users.githubbrowser.api

import com.githubbrowser.infrastructure.users.GitHubUserFaker
import com.githubbrowser.infrastructure.users.GitHubUserRestClient
import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

@ActiveProfiles("ft")
@AutoConfigureMockMvc
@ContextConfiguration
@SpringBootTest(classes = [TestContext.class])
class UserControllerFT extends Specification {

    @Autowired
    MockMvc mockMvc

    @SpringBean
    GitHubUserRestClient gitHubUserRestClient = Mock(GitHubUserRestClient.class)

    def 'should throw 404 if user not found'() {
        given:
        gitHubUserRestClient.findUserByLogin(_ as String) >> Optional.empty()

        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get("/users/something")
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn()
                .response

        then:
        result.status == 404
    }

    def 'should successfully return user details'() {
        given:
        gitHubUserRestClient.findUserByLogin(_ as String) >> Optional.of(GitHubUserFaker.GITHUB_USER)

        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get("/users/octocat")
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn()
                .response

        then:
        result.status == 200
    }

}
