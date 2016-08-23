package io.cotrix.jeecookbook.exceptions;


import io.cotrix.jeecookbook.message.Message;

import java.time.LocalDateTime;
import java.util.UUID;

public class TechnicalException extends RuntimeException {

    private String id;

    private LocalDateTime timestamp;

    private Message message;

    public TechnicalException(String message) {
        init();
        this.message = new Message(message);
    }

    public TechnicalException(Enum<?> code, String message) {
        init();
        this.message = new Message(code, message);
    }

    public TechnicalException(Throwable cause) {
        super(cause);
        init();
    }

    public TechnicalException(String message, Throwable cause) {
        super(cause);
        init();
        this.message = new Message(message);
    }

    public TechnicalException(Enum<?> code, String message, Throwable cause) {
        super(cause);
        init();
        this.message = new Message(code, message);
    }

    private void init(){
        id = UUID.randomUUID().toString();
        timestamp = LocalDateTime.now();
    }

}
