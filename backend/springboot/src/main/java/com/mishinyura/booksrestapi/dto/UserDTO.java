package com.mishinyura.booksrestapi.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Class UserDTO.
 * Implements User DTO.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 08.07.2022
 */
@Getter
@Setter
public class UserDTO {
    /**
     * Username.
     */
    @NotEmpty(message = "Username should not be empty")
    @Size(min = 2, max = 50, message = "Username should be between 2 and 50")
    private String username;

    /**
     * Password.
     */
    @NotEmpty(message = "Password should not be empty")
    private String password;
}
