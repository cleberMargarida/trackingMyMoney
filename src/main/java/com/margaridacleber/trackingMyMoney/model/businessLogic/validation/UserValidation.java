package com.margaridacleber.trackingMyMoney.model.businessLogic.validation;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "Username", "The Username cant be null");
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "Password", "The Password cant be null");
    }
}
