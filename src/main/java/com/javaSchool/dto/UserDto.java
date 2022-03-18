package com.javaSchool.dto;

import com.javaSchool.entity.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
public class UserDto {

    private int id;

    @NotBlank(message = "Login can't be empty")
    @Size(min = 8)
    private String login;

    @NotBlank(message = "Password can't be empty")
    @Size(min = 8, max = 200)
    private String password;

    @NotBlank(message = "User name must have at least 2 symbols")
    @Size(min = 2)
    private String userName;

    private Role role;

}
