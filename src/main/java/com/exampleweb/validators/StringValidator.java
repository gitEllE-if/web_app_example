package com.exampleweb.validators;

public class StringValidator {

    public static boolean validate(String value) {
        return !(value == null || value.length() == 0);
    }
}