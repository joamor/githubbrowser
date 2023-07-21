package com.githubbrowser.api.users;

import com.githubbrowser.domain.users.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseDtoFactory {

    public static UserResponseDto create(User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .login(user.getLogin())
                .name(user.getName().orElse(null))
                .type(user.getType())
                .avatarUrl(user.getAvatarUrl())
                .createdAt(user.getCreatedAt())
                .calculation(user.getCalculation())
                .build();
    }

}
