package com.Ox21.IdentityService.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ErrorCode {

    USER_EXISTED(1000, "User exist"),
    EMAIL_INVALID(1001, "Email invalid"),
    USER_NOT_EXISTED(1002, "User not exist")

    ;
    int code;
    String status;
}
