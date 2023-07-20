package com.githubbrowser.api.users;

import com.githubbrowser.domain.users.UserApplicationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserHandler {

    private final UserApplicationService userApplicationService;

    public ResponseEntity<UserResponseDto> findByLogin(String login) {
        return ResponseEntity.ok(
                UserResponseDtoFactory.create(
                        userApplicationService.findByLogin(login)));
    }

}
