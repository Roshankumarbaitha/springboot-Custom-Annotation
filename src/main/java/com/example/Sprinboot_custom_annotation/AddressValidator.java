package com.example.Sprinboot_custom_annotation;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<AddressValidation,String>
{
	List<String> address= Arrays.asList("Delhi","bangalore","dubai");
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context)
	{
	    return address.contains(value);
	}
}
