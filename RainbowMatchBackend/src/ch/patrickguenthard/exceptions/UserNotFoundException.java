package ch.patrickguenthard.exceptions;


public class UserNotFoundException extends UserException {
    public UserNotFoundException() {
	super();
    }

    public UserNotFoundException(String message) {
	super(message);
    }

}
