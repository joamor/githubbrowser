package com.githubbrowser.api.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;

@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class UserResponseDto {

    @NonNull
    private final Integer id;

    @NonNull
    private String login;

    @NonNull
    private String name;

    @NonNull
    private String type;

    private String avatarUrl;

    @NonNull
    private Instant createdAt;

    @NonNull
    private Integer calculation;

}
