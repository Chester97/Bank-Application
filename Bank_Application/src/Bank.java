import java.util.ArrayList;

public class Bank {
	ArrayList<Account> listOfCustomers = new ArrayList<Account>();
	private int idCounter = 0;
	
	public void addAccount(Account a) {
		a.setUserId(this.idCounter);
		listOfCustomers.add(a);
		this.idCounter++;
	}
	public void removeAccount(Account a) {
		listOfCustomers.remove(a);
	}
	public void renderAccounts() {
		for(int i = 0; i < listOfCustomers.size(); i++) {
			Account element = listOfCustomers.get(i);
			System.out.println(
				"Name: "+element.getName()+"\n"+
				"Surname: "+element.getSurname()+"\n"+
				"Id: "+element.getUserId()+"\n"+"Card Number: "+element.getCardNumber()+"\n"+
				"Account balance: "+element.getAccountBalance()+"$"+"\n"
			);
		}
	}
	
	public Account searchUserById(int userID) {
		for(int i = 0; i < listOfCustomers.size(); i++) {
			Account currentUser = listOfCustomers.get(i);
			if(currentUser.getUserId() == userID) {
				return currentUser;
			}
		}
		return null;
	}
	
	public void depositMoney(double cash, int customerID) {
		Account currentUser = searchUserById(customerID);
		if(currentUser != null) {
			double sumOfUserBalance = currentUser.getAccountBalance() + cash;
			currentUser.setAccountBalance(sumOfUserBalance);
		}else {
			System.out.println("No User With This ID!");
		}
	}
	
	public void renderAccountBalance(int customerID) {
		Account currentUser = searchUserById(customerID);
		if(currentUser != null) {
			System.out.println("Your account balance is: "+currentUser.getAccountBalance());			
		}else {
			System.out.println("No User With Such ID!");
		}
	}
	
	public void withdrawMoney(double cash, int customerID) {
		Account currentUser = searchUserById(customerID);
		if(currentUser != null) {
			double balance = currentUser.getAccountBalance() - cash;
			currentUser.setAccountBalance(balance);
		}else {
			System.out.println("No User With Such ID!");
		}
	}
}
