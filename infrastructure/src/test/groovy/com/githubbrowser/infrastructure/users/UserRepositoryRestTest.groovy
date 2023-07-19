package com.githubbrowser.infrastructure.users

import spock.lang.Specification

class UserRepositoryRestTest extends Specification {

    GitHubUserRestClient gitHubUserRestClient = Mock()

    UserRepositoryRest sut = new UserRepositoryRest(gitHubUserRestClient)

    def 'should return Optional.empty if cannot find user with given login'() {
        given:
        gitHubUserRestClient.findUserByLogin(_ as String) >> Optional.empty()

        when:
        def result = sut.findByLogin("something")

        then:
        result.isEmpty()
    }

    def 'should return details of GitHub user with given login'() {
        given:
        gitHubUserRestClient.findUserByLogin(_ as String) >> Optional.of(GitHubUserFaker.GITHUB_USER)

        when:
        def result = sut.findByLogin("octocat")

        then:
        !result.isEmpty()
        verifyAll(result.get()) {
            id == GitHubUserFaker.GITHUB_USER.id
            login == GitHubUserFaker.GITHUB_USER.login
            name == GitHubUserFaker.GITHUB_USER.name
            type == GitHubUserFaker.GITHUB_USER.type
            avatarUrl == GitHubUserFaker.GITHUB_USER.avatarUrl
            createdAt == GitHubUserFaker.GITHUB_USER.createdAt
            followersNumber == GitHubUserFaker.GITHUB_USER.followersNumber
            publicReposNumber == GitHubUserFaker.GITHUB_USER.publicReposNumber
        }
    }

}
