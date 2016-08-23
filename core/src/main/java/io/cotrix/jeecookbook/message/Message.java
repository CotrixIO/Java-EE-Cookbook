package io.cotrix.jeecookbook.message;

public class Message {

    private String message;

    private Enum<?> code;

    public Message(Enum<?> code, String message) {
        this.message = message;
        this.code = code;
    }

    public Message(Enum<?> code, String message, Object ... args) {
        this.message = buildMessage(message, args);
        this.code = code;
    }

    public Message(String message, Object ... args) {
        this.message = buildMessage(message, args);
        this.code = code;
    }

    public Message(String message) {
        this.message = message;
    }

    private String buildMessage(String message, Object ... args){
        for (Object argument : args) {
            message = message.replaceFirst("\\{\\}",argument.toString());
        }
        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
