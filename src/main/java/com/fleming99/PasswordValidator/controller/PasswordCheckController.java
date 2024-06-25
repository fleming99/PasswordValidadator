package com.fleming99.PasswordValidator.controller;

import com.fleming99.PasswordValidator.core.dto.PasswordDTO;
import com.fleming99.PasswordValidator.core.exceptions.IncompletePassword;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PasswordCheckController {

    @PostMapping("/password-check")
    @ExceptionHandler(IncompletePassword.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public PasswordDTO passwordChecker(@Valid @RequestBody PasswordDTO passwordDTO){
        try {
            return passwordDTO;
        }catch (Exception e){
            throw new IncompletePassword(e.getMessage());
        }
    }
}
