package atm;

import static org.junit.Assert.*;

import org.junit.Test;

public class AtmTest {

	@Test
	public void canCreateAtmWithPin() {
		Atm testAtm = new Atm("1234");
	}

	@Test
	public void canAccessAtm() {
		Atm testAtm = new Atm("1234");
		boolean canAccess = testAtm.allowAccess("1234");
		assertTrue(canAccess);
	}
	
	@Test
	public void cantAccessAtm() {
		Atm testAtm = new Atm("1264");
		boolean canAccess = testAtm.allowAccess("1234");
		assertFalse(canAccess);
	}	

	@Test
	public void hasBalance() {
		Atm testAtm = new Atm("1234");
		double balance = testAtm.getBalance();
	}
	
	@Test
	public void canDeposit() {
		Atm testAtm = new Atm("1234");
		double balanceBefore = testAtm.getBalance();
		testAtm.deposit(250.67);
		double balanceAfter = testAtm.getBalance();
		assertEquals(balanceAfter, balanceBefore + 250.67, 0); 
	}
	
	@Test
	public void allowWithdraw() {
		Atm testAtm = new Atm("1234");
		double balanceBefore = testAtm.getBalance();
		testAtm.withdraw(40.50);
		double balanceAfter = testAtm.getBalance();
		assertEquals(balanceAfter, balanceBefore - 40.50, 0); 
	}
	
	@Test
	public void limitWithdraw() {
		Atm testAtm = new Atm("1234");
		double balanceBefore = testAtm.getBalance();
		testAtm.withdraw(101.50);
		double balanceAfter = testAtm.getBalance();
		assertEquals(balanceAfter,0, 0);
	}
}
