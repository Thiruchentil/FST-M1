package activity2;

public class activity2 {
	public static void main(String[] args) {
		int total = 0;
		int nums[] = { 10, 77, 10, 54, -11, 10 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) {
				total = nums[i] + total;
			}

		}
		System.out.println(total);
	}
}
