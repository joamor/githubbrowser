package com.githubbrowser.infrastructure.userrequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Objects;

@Data
@SuperBuilder
@Entity
@Table("user_requests")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserRequestEntity implements Serializable {

    @Id
    private String login;

    @Version
    @Column(name = "request_counter", nullable = false)
    private Integer requestCounter;

    public static UserRequestEntity of(String login) {
        return UserRequestEntity.builder()
                .login(login)
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequestEntity that = (UserRequestEntity) o;
        return Objects.equals(login, that.login) && Objects.equals(requestCounter, that.requestCounter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, requestCounter);
    }

}
