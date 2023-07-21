package com.githubbrowser.infrastructure.userrequest;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRequestEntityFactory {

    public static UserRequestEntity create(String login) {
        return UserRequestEntity.builder()
                .login(login)
                .requestCounter(0)
                .build();
    }

    public static UserRequestEntity updateRequestCounter(UserRequestEntity userRequestEntity) {
        return userRequestEntity.toBuilder()
                .requestCounter(userRequestEntity.getRequestCounter() + 1)
                .build();
    }

}
