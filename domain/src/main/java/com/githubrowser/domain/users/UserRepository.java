package com.githubrowser.domain.users;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByLogin(String login);

}
