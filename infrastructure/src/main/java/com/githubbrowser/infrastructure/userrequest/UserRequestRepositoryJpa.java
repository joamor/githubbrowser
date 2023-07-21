package com.githubbrowser.infrastructure.userrequest;

import com.githubbrowser.infrastructure.BaseRepository;

import java.util.Optional;

public interface UserRequestRepositoryJpa extends BaseRepository<UserRequestEntity, String> {

    Optional<UserRequestEntity> findByLogin(String login);

}
