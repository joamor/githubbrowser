package com.githubbrowser.api.users;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserHandler userHandler;

    @GetMapping("/{login}")
    public UserResponseDto findByLogin(@PathVariable String login) {
        return userHandler.findByLogin(login);
    }

}
