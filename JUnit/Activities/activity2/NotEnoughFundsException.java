package activity2;

public class NotEnoughFundsException {
	public NotEnoughFundsException(Integer amount, Integer balance) {
		super("Attempted to withdraw " + amount + " with a balance of " + balance);
	}

}
