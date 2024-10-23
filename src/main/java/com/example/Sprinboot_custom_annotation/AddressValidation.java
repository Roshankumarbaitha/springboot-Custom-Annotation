package com.example.Sprinboot_custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jakarta.validation.Payload;
@Target(ElementType.FIELD)

public @interface AddressValidation 
{
	String message() default "fill the correct city name";
	
	Class<?>[] group()default{};
	
	Class<? extends Payload>[] payload()default {};

}
