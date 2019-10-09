package com.codetears.lambda;


public class MemberServiceException extends RuntimeException {

    private static final long serialVersionUID = 2319745842416889789L;

    public MemberServiceException() {
        super();
    }

    public MemberServiceException(String message) {
        super(message);
    }

    public MemberServiceException(Throwable cause) {
        super(cause);
    }

    public MemberServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
 