import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static Bank bank = new Bank();
	static Account newAccount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action();
	}
	
	public static void renderMenu() {
		System.out.println("\n");
		System.out.println("-------Please chose an action.-------");
		System.out.println("1) Create an account.");
		System.out.println("2) Withdraw money.");
		System.out.println("3) Deposit money.");
		System.out.println("4) Check account balance.");
		System.out.println("0) Exit.");
		System.out.println("\n");
	}
	
	public static void printHeader() {
		System.out.println("          -------------------------");
		System.out.println("          |                       |");
		System.out.println("          |  Welcome in HEX Bank  |");
		System.out.println("          |                       |");
		System.out.println("          ------------------------");
	}
	public static void action() {
		int option = -1;
		double depositCash;
		int customerID;
		String name;
		String surname;
		renderMenu();
		do {
			
			System.out.println("\n");
			System.out.println("======================================================================");
			System.out.println("Enter an option");
			option = scanner.nextInt();
			
			switch(option) {
			case 1:
				System.out.print("Your name: ");
				scanner.nextLine();
				name = scanner.nextLine();
				System.out.print("Your surname: ");
				surname = scanner.nextLine();
				newAccount = new Account();
				newAccount.setUserDetails(name, surname);
				bank.addAccount(newAccount);
				System.out.println("User has been added");
				break;
			case 2:
				System.out.println("Your ID: ");
				customerID = scanner.nextInt();
				System.out.println("Enter value: ");
				depositCash = scanner.nextDouble();
				bank.withdrawMoney(depositCash, customerID);
				break;
			case 3:
				System.out.print("Type Your ID: ");
				customerID = scanner.nextInt();
				System.out.print("Enter value: ");
				depositCash = scanner.nextDouble();
				bank.depositMoney(depositCash, customerID);
				break;
			case 4:
				System.out.println("Type Your ID: ");
				customerID = scanner.nextInt();
				bank.renderAccountBalance(customerID);
				break;
			case 5:
				bank.renderAccounts();
				break;
			default:
				System.out.println("Invalid action.");
				break;
			}
		}while(option != 0);
	}

}
