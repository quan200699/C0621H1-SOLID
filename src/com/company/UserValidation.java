package com.company;

public class UserValidation implements Validator {
    @Override
    public boolean isValid(String username) {
        if (username.equals("user")) {
            return true;
        } else {
            return false;
        }
    }
}
