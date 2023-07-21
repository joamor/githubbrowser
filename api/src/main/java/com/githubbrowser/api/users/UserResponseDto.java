package com.githubbrowser.api.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.time.Instant;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class UserResponseDto {

    @NonNull
    private final int id;

    @NonNull
    private String login;

    private String name;

    @NonNull
    private String type;

    private String avatarUrl;

    @NonNull
    private Instant createdAt;

    @NonNull
    private int calculation;

}
