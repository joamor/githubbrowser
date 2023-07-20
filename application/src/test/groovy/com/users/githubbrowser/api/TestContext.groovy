package com.users.githubbrowser.api

import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = [
        "com.githubbrowser.api.**",
        "com.githubbrowser.domain.**",
        "com.githubbrowser.infrastructure.**"
])
class TestContext {
}
