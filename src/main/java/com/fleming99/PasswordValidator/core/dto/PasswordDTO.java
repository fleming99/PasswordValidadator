package com.fleming99.PasswordValidator.core.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordDTO {

    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[!#@$^%&])(?=.*[0-9])(?=.*[a-z]).{8,16}$",
            message = "Password needs to contain: minimum of 8 characters, maximum of 16 characters, 1 uppercase letter, 1 lowercase letter, 1 special character and 1 number.")
    private String password;
}
