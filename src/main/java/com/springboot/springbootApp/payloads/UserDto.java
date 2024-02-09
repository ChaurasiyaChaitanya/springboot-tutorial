package com.springboot.springbootApp.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must have atleast 4 characters")
	private String username;
	
	@Email(message = "Email address is not valid!")
	private String email;
	
	@NotEmpty
	@Size(min = 4 , max = 8 , message = "Password must have minimum 4 characters and maximum 8 characters.")
	private String password;
}
