package com.githubbrowser.domain.users

import java.time.Instant

class UserFaker {

    static User USER = User.builder()
            .id(1)
            .login("octocat")
            .name('Test Test')
            .type('User')
            .avatarUrl('https://avatars.githubusercontent.com/u/19227682?v=4')
            .createdAt(Instant.parse('2008-01-14T04:33:35Z'))
            .followersNumber(2)
            .publicReposNumber(2)
            .build()

    static User USER_WITH_ZERO_FOLLOWERS = USER.toBuilder()
            .followersNumber(0)
            .build()

}
