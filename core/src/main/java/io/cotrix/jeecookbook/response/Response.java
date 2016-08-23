package io.cotrix.jeecookbook.response;

import io.cotrix.jeecookbook.message.Message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Response<T> {

    private T entity;

    private boolean success = true;

    private List<Message> messages = new ArrayList<>();

    public Response(boolean success) {
        this.success = success;
    }

    public Response(T entity) {
        this.entity = entity;
    }

    public Response() {
    }

    public boolean isSuccess() {
        return success;
    }

    public List<Message> getMessages() {
        return Collections.unmodifiableList(messages);
    }

    public void addMessage(Message message){
        this.messages.add(message);
    }

    public void addMessage(Enum<?> code, String message){
        addMessage(new Message(code, message));
    }

    public void addMMessage(String message){
        addMessage(new Message(message));
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
