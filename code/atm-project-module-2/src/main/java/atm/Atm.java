package atm;

import java.math.BigDecimal;
import java.math.MathContext;

public class Atm {

	private String requiredPin;
	
	private BigDecimal balance = new BigDecimal(100);
	
	public Atm(String requiredPin) {
		this.requiredPin = requiredPin;
	}

	public boolean allowAccess(String enteredPin) {
		if (enteredPin.equals(requiredPin)) {
			return true;
		} else {
			return false;
		}
	}

	public double getBalance() {
		return balance.doubleValue();
	}

	public void deposit(double amount) {
		balance = balance.add(new BigDecimal(amount));
	}

	public void withdraw(double amount) {		
		if (new BigDecimal(amount).compareTo(balance) > 0) {
			balance = new BigDecimal(0);
		} else {
			balance = balance.subtract(new BigDecimal(amount));
		}
	}

}
