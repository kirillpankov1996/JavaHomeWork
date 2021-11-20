package com.pb.pankov.hw8;

import java.util.regex.Pattern;

public class Auth {

    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        Pattern loginPattern = Pattern.compile("[A-Za-z0-9]{5,20}");
        Pattern passwordPattern = Pattern.compile("[A-Za-z0-9_]{5,}");
        Pattern confirmPasswordPattern = Pattern.compile(password);
        boolean isLoginValid = loginPattern.matcher(login).matches();
        boolean isPasswordValid = passwordPattern.matcher(password).matches();
        boolean isPasswordsEqual = confirmPasswordPattern.matcher(confirmPassword).matches();

        if (!isLoginValid) {
            throw new WrongLoginException("Невалидный логин");
        } else if (!isPasswordValid) {
            throw new WrongPasswordException("Невалидный пароль");
        } else if (!isPasswordsEqual) {
            throw new WrongPasswordException("Пароли не совпадают");
        } else {
            this.login = login;
            this.password = password;
            System.out.println("**Успешная регистрация**");
        }
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (login.equals(this.login) && password.equals(this.password)) {
            System.out.println("**Успешный вход**");
        } else  {
            throw new WrongLoginException("Неверный логин или пароль");
        }
    }
}