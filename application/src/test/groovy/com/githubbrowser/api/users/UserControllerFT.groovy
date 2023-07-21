package com.githubbrowser.api.users

import com.githubbrowser.api.BaseApplicationFT
import com.githubbrowser.infrastructure.users.GitHubUserFaker
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

class UserControllerFT extends BaseApplicationFT {

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
