import java.util.*;

public class Account extends Bank{
	private String name, surname;
	private int userId;
	private int cardNumber;
	private double accountBalance = 0.0;
	
	Random random = new Random();

	public String getName() {
		return name;
	}

	public void setUserDetails(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
		setCardNumber();
	}
	
	public String accountDetail() {
		return "Name: "+getName()+"\n"+"Surname: "+getSurname()+"\n"+"UserID: "+getUserId();
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber() {
		this.cardNumber = 100000000 + random.nextInt(900000000);
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}