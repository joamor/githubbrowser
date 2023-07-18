package com.users.githubbrowser.api

import com.githubbrowser.application.GithubbrowserApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

@AutoConfigureMockMvc
@SpringBootTest(classes = GithubbrowserApplication.class)
class UserControllerFT extends Specification {

    @Autowired
    MockMvc mockMvc

    def 'should return null'() {
        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get("/users/something"))
        .andReturn()
        .response

        then:
        result.status == 200
        result.contentAsString == null
    }

}
