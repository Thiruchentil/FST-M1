package activity8;

public class activity8 {
	public static void main(String[] args) {
		try {
			activity8.exceptionTest("Will print to console");

			activity8.exceptionTest(null);
			activity8.exceptionTest("Won't execute");
		} catch (CustomException a) {
			System.out.println("Inside catch block: " + a.getMessage());
		}
	}

	static void exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("String value is null");
		} else {
			System.out.println(str);
		}

	}

}
