package com.Ox21.IdentityService.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserTextLoginRequest {
    private String inputLogin;
    // type input: 1- login with username, 2- login with email
    private int typeInput;
}
