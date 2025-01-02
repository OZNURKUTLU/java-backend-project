package com.example.backend.dto;

import com.example.backend.validator.UniqueUserName;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserCreateDTO {

	@NotNull(message ="{backend.constrains.username.NotNull.message}")
	@Size(min = 4, max = 24, message ="{backend.constrains.username.Size.message}" )
	@UniqueUserName
	private String userName;
	
	@NotNull(message ="{backend.constrains.firstname.NotNull.message}")
	@Size(min = 2, max = 32, message ="{backend.constrains.firstname.Size.message}" )
	private String firstName;
	
	@NotNull(message ="{backend.constrains.lastname.NotNull.message}")
	@Size(min = 3, max = 32, message ="{backend.constrains.lastname.Size.message}" )
	private String lastName;
	

}
