package com.githubbrowser.api

import com.githubbrowser.application.GithubbrowserApplication
import com.githubbrowser.domain.userrequest.UserRequestRepository
import com.githubbrowser.infrastructure.users.GitHubUserRestClient
import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@ActiveProfiles("ft")
@AutoConfigureMockMvc
@ContextConfiguration
@SpringBootTest(classes = [GithubbrowserApplication.class])
class BaseApplicationFT extends Specification {

    @Autowired
    MockMvc mockMvc

    @SpringBean
    GitHubUserRestClient gitHubUserRestClient = Mock(GitHubUserRestClient.class)

    @Autowired
    UserRequestRepository userRequestRepository

}
