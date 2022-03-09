package com.wzdemo.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class _IDCustomValid implements ConstraintValidator<IDCustomValid, Long> {
    @Override
    public void initialize(IDCustomValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext constraintValidatorContext) {
        if(value==null){
            return false;
        }
        if(Long.toString(value).length()<=10 && Long.toString(value).length()>=8) {
            return true;
        }
        return false;
    }


}
