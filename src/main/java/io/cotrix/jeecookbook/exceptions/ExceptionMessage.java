package io.cotrix.jeecookbook.exceptions;

class ExceptionMessage {

    private String message;

    private Enum<?> code;

    ExceptionMessage(Enum<?> code, String message) {
        this.message = message;
        this.code = code;
    }

    ExceptionMessage(Enum<?> code, String message, Object ... args) {
        this.message = buildMessage(message, args);
        this.code = code;
    }

    ExceptionMessage(String message, Object ... args) {
        this.message = buildMessage(message, args);
        this.code = code;
    }

    public ExceptionMessage(String message) {
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
        return "ExceptionMessage{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
