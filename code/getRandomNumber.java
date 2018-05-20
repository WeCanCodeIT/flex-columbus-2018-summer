import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		// Create a random number generator
		Random rand = new Random();
		
		for (int i = 0; i < 20; i++) {
			// Get a random number, including 0, excluding the #
			int zeroToFive = rand.nextInt(6);
			
			// Add 1 to get a value between 1 and the passed #
			int result = zeroToFive + 1;
			
			System.out.println("Rolled the die and got: " + result);
		}
	}

}
