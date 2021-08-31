package com.company;

public class UserValidation1 implements Validator {
    public boolean isValid(String username) {
        if (username.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}
