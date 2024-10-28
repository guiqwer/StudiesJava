package model.entities.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    //passar a mensagem pro construtor da super classe
    public DomainException(String message) {
        super(message);
    }
}
