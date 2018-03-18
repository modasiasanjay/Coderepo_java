package game;
import java.util.Random;
import java.util.Scanner;


class SlotMachine {
	private Scanner sc;
	/*private final int APPLE = 0;
	private final int GREPPES = 1;
	private final int WATERMELON = 2;
	private final int GUAVA = 3;
	private final int ORANGE = 4;
	private final int RASPBERRY = 5;
	private final int PEARS = 6;
	private int totalQuater = 160;*/
	double moneyEntered;
	

	public double readDouble() {
		double num;
		sc = new Scanner(System.in);
		num =  sc.nextDouble();
		System.out.println(num);
		
		return num;
	}
	public double insertQuater(){
		System.out.println("Enter Quater");
		sc = new Scanner(System.in);
		moneyEntered = sc.nextDouble();
		System.out.println("Entered successfully"+moneyEntered);
		return moneyEntered;
	}
	public double startSlotMachine() {
		
		double totalMoney = 0.0d;
		double winnings = 0.0d;
		double moneyWon = 0.0d;
		boolean spinned_1 = false;
		boolean spinned_2 = false;
		int spinIndex[] = { -1, -2, -3 };
		int maxLimit = 5;
		int spinNumber = 1;
		totalMoney += moneyEntered;

		for (int spin = 1; spin <= maxLimit + 1; spin++) {
			int rand = generateRandom(maxLimit);

			if (rand == spin) {
				if (spinNumber > 3) // Spin only 3 times.
					break;
				spinIndex[spinNumber - 1] = spin;

				// Move to next spinner if match found.
				spinNumber++;
				spin = 0;
				continue;
			}

			if (spinNumber == 1 && spin == 1)
				spinned_1 = true;

			if (spin > maxLimit) {
				spinNumber++;
				if (spinNumber > 3) // Spin only 3 times.
					break;
			}

			if (spinNumber == 2 && spinned_1) {
				spin = 0; // reset the spinner for next Spin.
				spinned_1 = false;
				spinned_2 = true;
			} else if (spinNumber == 3 && spinned_2) {
				spin = 0;// reset the spinner for next Spin.
				spinned_2 = false;
			}
		}

		// Check for 2 matches.
		if (spinIndex[0] == spinIndex[1] || spinIndex[1] == spinIndex[2] || spinIndex[0] == spinIndex[2]) {
			totalMoney *= 2;
			winnings = totalMoney;
		}

		// Check for 3 matches.
		else if (spinIndex[0] == spinIndex[1] && spinIndex[1] == spinIndex[2]) {
			totalMoney *= 3;
			winnings = totalMoney;
		}

		System.out.println("Spin status :");
		for (int i = 0; i < 3; i++)
			System.out.println("Spin " + (i + 1) + " : " + spinIndex[i]);

		System.out.println("\nYou put $" + moneyEntered + " on slot machine");
		moneyWon = winnings - moneyEntered;
		return moneyWon;
	}

	public int generateRandom(int randMaxLimit) {
		Random random = new Random();
		int Low = 0;
		int High = randMaxLimit;
		int rand = random.nextInt(High - Low) + Low;
		return rand;
	}
	
	public void exit(){
		System.exit(0);
		System.out.print("Game Finished !");
	}
}
