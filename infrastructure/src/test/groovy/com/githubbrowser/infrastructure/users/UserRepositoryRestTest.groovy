package com.githubbrowser.infrastructure.users

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class UserRepositoryRestTest extends Specification {

    @Autowired
    UserRepositoryRest sut

    def 'should return Optional.empty'() {
        when:
        def result = sut.findByLogin("something")

        then:
        result.isEmpty()

    }

}
