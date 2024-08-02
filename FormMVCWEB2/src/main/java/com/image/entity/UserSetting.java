package com.image.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserSetting {
    @NotEmpty(message = "uname is required")
    @Size(min = 3, max = 8, message = "uname should be between 3 to 8 characters")
    private String uname;

    @NotEmpty(message = "password is required")
    @Size(min = 6, message = "password should be at least 6 characters")
    private String pwd;

    @NotEmpty(message = "Email is required")
    @Email(message = "Enter a valid Email Id")
    private String email;

    @NotEmpty(message = "PhoneNo is required")
    @Size(min = 10, message = "PhoneNo should have at least 10 digits")
    private String phno;

    @NotNull(message = "Age is required")
    @Min(value = 21, message = "Age should be a minimum of 21 years")
    @Max(value = 40, message = "Age should be a maximum of 40 years")
    private Integer age;
}