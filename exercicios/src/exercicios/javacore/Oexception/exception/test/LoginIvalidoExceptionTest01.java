package exercicios.javacore.Oexception.exception.test;

import exercicios.javacore.Oexception.exception.domain.LoginInvalidoException;

public class LoginIvalidoExceptionTest01 {
    static void main() {
        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidoException {
        String usernameDB = "admn";
        String passwordDB = "admin";
        if (!usernameDB.equals(passwordDB)) {
            throw new LoginInvalidoException();
        }
        System.out.println("Login realizado com sucesso!");
    }
}
