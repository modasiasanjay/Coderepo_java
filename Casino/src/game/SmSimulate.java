package game;

import java.util.Scanner;

public class SmSimulate {
	public static void main(String[] args) {
		SlotMachine slotMachine = new SlotMachine();
		boolean keepPlaying = true;
		char choice;
		int option = 0;

		do {
			System.out.println("########## Please choose an Option ##########\n");
			System.out.println("1. P1 = Please insert quater in Machine 1");
			/*System.out.println("2. P2 = Please insert quater in Machine 2");*/
			System.out.println("2. V1 = View Machine 1");
			/*System.out.println("4. V2 = View Machine 2");*/
			System.out.println("3. C1 = Check Machine 1 Cash");
			/*System.out.println("6. C2 = Check Machine 2 Cash");*/
			/*System.out.println("7. R1 = Reload Machine 1");
			System.out.println("8. R2 = Reload Machine 2");*/
			System.out.println("4. Quit\n");
			System.out.println("#############################################");
			System.out.println("\n");
			System.out.println(">");

			while (option <= 4) {
				Scanner sc;
				sc = new Scanner(System.in);
				option = sc.nextInt();

				switch (option) {
				case 1:
					slotMachine.insertQuater();
					break;
				case 2:
					slotMachine.startSlotMachine();
					break;
				case 3:
					System.out.println("Remaining");
					break;
				case 4:
					slotMachine.exit();
					return;
				}

			System.out.println("\nYou want to play again? (Y/N)");
			Scanner sc1 = new Scanner(System.in);
			choice = sc1.next().charAt(0);
			if (choice == 'Y' || choice == 'y')
				keepPlaying = true;
			else
				keepPlaying = false;
			}
		}while (keepPlaying);
	}
}