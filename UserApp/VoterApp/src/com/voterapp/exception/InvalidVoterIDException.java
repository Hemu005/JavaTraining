package com.voterapp.exception;

public class InvalidVoterIDException extends NotEligibleException{
    public InvalidVoterIDException() {
    }

    public InvalidVoterIDException(String message) {
        super(message);
    }
}
