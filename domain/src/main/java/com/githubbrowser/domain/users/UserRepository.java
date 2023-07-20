package com.githubbrowser.domain.users;

import com.githubbrowser.domain.exceptions.ObjectNotFoundException;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByLogin(String login);

    default User getByLogin(String login) {
        return findByLogin(login).orElseThrow(() -> new ObjectNotFoundException(login));
    }

}
