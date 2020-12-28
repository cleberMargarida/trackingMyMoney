package com.margaridacleber.trackingMyMoney.model.businessLogic.validation;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.Standard;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class StdValidation<TObj extends Standard> implements org.springframework.validation.Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Standard.class.equals(aClass);
    }

    @Override
    public void validate(Object obj, Errors e) {

        ValidationUtils.rejectIfEmpty(e, "Id", "The identifier cant be null");
    }
}
