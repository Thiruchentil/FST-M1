package activity8;

public class CustomException extends Exception {
	private String message = "hello";

	public CustomException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
