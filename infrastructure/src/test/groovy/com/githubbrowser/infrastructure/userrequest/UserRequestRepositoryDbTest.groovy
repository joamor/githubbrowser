package com.githubbrowser.infrastructure.userrequest

import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification
import spock.lang.Subject

class UserRequestRepositoryDbTest extends Specification {

    @Autowired
    UserRequestRepositoryJpa userRequestRepositoryJpa

    @Subject
    UserRequestRepositoryDb sut = new UserRequestRepositoryDb(userRequestRepositoryJpa)

    def 'should correctly create and update user request counter'() {
        when:
        sut.save('test')
        def result = sut.save('test')

        then:
        verifyAll(result) {
            it.login == 'test'
            it.requestCounter == 2
        }
    }

}
