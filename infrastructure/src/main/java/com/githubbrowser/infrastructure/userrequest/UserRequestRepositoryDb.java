package com.githubbrowser.infrastructure.userrequest;

import com.githubbrowser.domain.userrequest.UserRequestRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserRequestRepositoryDb implements UserRequestRepository {

    private final UserRequestRepositoryJpa userRequestRepositoryJpa;

    @Override
    public void save(String login) {
        UserRequestEntity userRequest = userRequestRepositoryJpa.findByLogin(login)
                .map(UserRequestEntityFactory::updateRequestCounter)
                .orElseGet(() -> UserRequestEntityFactory.create(login));
        userRequestRepositoryJpa.save(userRequest);
    }

}
