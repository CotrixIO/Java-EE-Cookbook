package io.cotrix.jeecookbook.exceptions;


import io.cotrix.jeecookbook.message.Message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BusinessException extends RuntimeException{

    private String id;

    private LocalDateTime timestamp;

    private List<Message> exceptions = new ArrayList<>();

    public BusinessException(Enum<?> code, String message){
        init();
        add(code, message);
    }

    public BusinessException(String message) {
        init();
        this.add(message);
    }

    public BusinessException(String message, Object ... args) {
        init();
        this.add(message, args);
    }

    public BusinessException(Enum<?> code, String message, Object ... args) {
        init();
        this.add(code, message, args);
    }

    public void add(Enum<?> code, String message){
        this.add(code, message);
    }

    public void add(Enum<?> code, String message, Object ... args){
        exceptions.add(new Message(code, message, args));
    }

    public void add(String message, Object ... args){
        exceptions.add(new Message(message, args));
    }

    public void add(String message){
        exceptions.add(new Message(message));
    }

    private void init(){
        id = UUID.randomUUID().toString();
        timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("BusinessException{");

        exceptions.forEach(builder::append);
        builder.append("}");
        return builder.toString();
    }
}
