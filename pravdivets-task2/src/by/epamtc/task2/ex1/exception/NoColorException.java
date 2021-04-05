package by.epamtc.task2.ex1.exception;

public class NoColorException extends Exception {
	public NoColorException() {
		super("null value instead of interface Color object");
	}

}
