package com.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.common.validation.UserEmailUniqueValidator;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {UserEmailUniqueValidator.class})
public @interface UserEmailUnique {
	String message() default "Email is Duplication";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
