package com.githubbrowser.domain.userrequest;

import com.githubbrowser.infrastructure.userrequest.UserRequestEntity;

public interface UserRequestRepository {

    UserRequestEntity save(String login);

}
