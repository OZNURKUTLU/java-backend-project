package com.example.backend.validator;

import com.example.backend.repository.UserRepository;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName, String> {

	private final UserRepository userRepository;
	
	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		return !userRepository.existUserByUsername(username);
	}

}
