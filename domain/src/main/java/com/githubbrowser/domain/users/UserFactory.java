package com.githubbrowser.domain.users;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserFactory {

    public static User create(UserProvider provider) {
        return User.builder()
                .id(provider.getId())
                .login(provider.getLogin())
                .name(Optional.ofNullable(provider.getName()))
                .type(provider.getType())
                .avatarUrl(provider.getAvatarUrl())
                .createdAt(provider.getCreatedAt())
                .followersNumber(provider.getFollowersNumber())
                .publicReposNumber(provider.getPublicReposNumber())
                .build();
    }

}
