package com.codetears.lambda;

/**
 * @Description: TODO
 * @Author mayunkun
 * @Date 2019-08-27
 * @Version V1.0
 **/
public class MyException extends RuntimeException {


    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
