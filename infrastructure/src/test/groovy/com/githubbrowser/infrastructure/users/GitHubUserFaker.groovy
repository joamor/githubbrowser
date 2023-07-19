package com.githubbrowser.infrastructure.users

import java.time.Instant

class GitHubUserFaker {

    static GitHubUser GITHUB_USER = GitHubUser.builder()
    .id(1)
    .login('octocat')
    .name('monalisa octocat')
    .type('User')
    .avatarUrl('https://github.com/images/error/octocat_happy.gif')
    .createdAt(Instant.parse('2008-01-14T04:33:35Z'))
    .followersNumber(20)
    .publicReposNumber(2)
    .build()

}
