package exercicios.javacore.Oexception.exception.domain;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("login ivalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
