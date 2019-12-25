package com.common.validation.annotation;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

import com.common.validation.UserIdUniqueValidator;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {UserIdUniqueValidator.class})
public @interface UserIdUnique {
	String message() default "UserId is Duplication";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
