package com.githubbrowser.api.users;

import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class UserResponseDto {

    @NonNull
    private final String id;

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
    private BigDecimal calculation;

}
