package com.githubbrowser.infrastructure.users;

import com.githubbrowser.domain.users.User;
import com.githubbrowser.domain.users.UserFactory;
import com.githubbrowser.domain.users.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserRepositoryRest implements UserRepository {

    private final GitHubUserRestClient gitHubUserRestClient;

    @Override
    public Optional<User> findByLogin(String login) {
        return gitHubUserRestClient.findUserByLogin(login)
                .map(UserFactory::create);
    }

}
