package io.cotrix.jeecookbook.sample.exceptions;


import io.cotrix.jeecookbook.exceptions.BusinessException;
import io.cotrix.jeecookbook.exceptions.TechnicalException;

public class ThrowingExceptions {

    public void exceptionWithMessage(){
        throw new BusinessException("Something has gone wrong");
    }

    public void exceptionWithCodeAndMessage(){
        throw new BusinessException(ErrorCode.FUNC_ERROR, "Something has gone wrong");
    }

    public void exceptionWithCodeMessageAndVariable(){
        throw new BusinessException(ErrorCode.FUNC_ERROR, "Something has gone wrong with data {}","my-data");
    }

    public void exceptionWithMultipleMessages(){
        BusinessException exception = new BusinessException("Something has gone wrong");
        exception.add(ErrorCode.FUNC_ERROR,"functional error");
        exception.add(ErrorCode.FUNC_ERROR,"another error");
        throw exception;
    }

    public void technicalExceptionWithMessage(){
        throw new TechnicalException("technical error");
    }

    public void technicalExceptionWithThrowable(){
        RuntimeException exception = new RuntimeException("RuntimeException");
        throw new TechnicalException(exception);
    }

    public void technicalExceptionWithMessageAndThrowable(){
        RuntimeException exception = new RuntimeException("RuntimeException");
        throw new TechnicalException("A problem occured",exception);
    }

    public void technicalExceptionWithEnumMessageAndThrowable(){
        RuntimeException exception = new RuntimeException("RuntimeException");
        throw new TechnicalException(ErrorCode.TECH_ERROR,"A problem occured",exception);
    }

}
