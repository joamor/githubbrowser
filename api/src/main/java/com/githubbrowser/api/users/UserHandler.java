package com.githubbrowser.api.users;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserHandler {

    public UserResponseDto findByLogin(String login) {
        return null;
    }

}
