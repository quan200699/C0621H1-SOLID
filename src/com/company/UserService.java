package com.company;

public class UserService {
    private Validator validator;

    public UserService(Validator validator) {
        this.validator = validator;
    }

    public void showAllUser() {
        System.out.println("Hiển thị danh sách user");
    }

    public void saveUser(String username) {
        if (validator.isValid(username)) {
            System.out.println("Tài khoàn này hợp lệ");
        } else {
            System.out.println("Tài khoản này không hợp lệ");
        }
    }
}
