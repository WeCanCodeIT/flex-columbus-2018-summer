package atm;

import java.util.Scanner;

public class AtmClient {

	public static void main(String[] args) {
		
		Atm atm = new Atm("7777");
		Scanner input = new Scanner(System.in);
		
		print("Please enter the 4-digit PIN:");
		String enteredPin = input.nextLine();
		
		if (atm.allowAccess(enteredPin)) {
			print("Welcome to the WCCI ATM!");
		} else {
			print("Incorrect PIN. Access Denied.");
			System.exit(0);
		}
		
		// Loop runs "forever" (until System.exit)
		while (true) {
			int inputNumber = 0;
			while(inputNumber < 1 || inputNumber > 4) {
				print("Press 1 to deposit funds: ");
				print("Press 2 to withdraw funds: ");
				print("Press 3 to check balance: ");
				print("Press 4 to exit: ");
				inputNumber = input.nextInt();
			}
			
			if (inputNumber == 1) {
				print("Please enter your deposit amount: ");
				double deposit = input.nextDouble();
				atm.deposit(deposit);
				System.out.println(atm.getBalance());
			} else if (inputNumber == 2) {
				print("Please enter your withdrawal amount: ");
				double withdrawal = input.nextDouble();
				atm.withdraw(withdrawal);
				System.out.println(atm.getBalance());
			} else if (inputNumber == 3) {
				print("Your current balance is: " + atm.getBalance());
			} else if (inputNumber == 4) {
				print("Have a nice day!");
				System.exit(0);
			}
		}
	}
	
	public static void print(String message) {
		System.out.println(message);
	}

}
