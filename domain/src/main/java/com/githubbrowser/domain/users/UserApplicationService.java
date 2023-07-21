package com.githubbrowser.domain.users;

import com.githubbrowser.domain.userrequest.UserRequestRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserApplicationService {

    private final UserRepository userRepository;
    private final UserRequestRepository userRequestRepository;

    public User findByLogin(String login) {
        userRequestRepository.save(login);
        return userRepository.getByLogin(login);
    }

}
