package com.githubbrowser.api.users

import com.githubbrowser.domain.users.UserFaker
import spock.lang.Specification

class UserResponseDtoFactoryTest extends Specification {

    def 'should correctly parse User domain object to UserResponseDto for GitHub user with #description'() {
        when:
        def result = UserResponseDtoFactory.create(user)

        then:
        verifyAll(result) {
            id == UserFaker.USER.id
            login == UserFaker.USER.login
            name == UserFaker.USER.name.get()
            type == UserFaker.USER.type
            avatarUrl == UserFaker.USER.avatarUrl
            createdAt == UserFaker.USER.createdAt
            calculation == expectedCalculation
        }

        where:
        description                | user                               | expectedCalculation
        'zero followers'           | UserFaker.USER_WITH_ZERO_FOLLOWERS | 0
        'more than zero followers' | UserFaker.USER                     | 12
    }

}
