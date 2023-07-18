package com.githubbrowser.infrastructure.users;

import com.githubrowser.domain.users.User;
import com.githubrowser.domain.users.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserRepositoryRest implements UserRepository {

    @Override
    public Optional<User> findByLogin(String login) {
        return Optional.empty();
    }

}
