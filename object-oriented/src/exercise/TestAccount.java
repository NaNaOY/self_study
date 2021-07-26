package exercise;

public class TestAccount {

	  public static void main(String[] args) {
	   Account account1=new Account();
	   account1.setId(1122);
	   account1.setBalance(20000);
	   account1.setAnnualInterestRate(4.5);
	   account1.withDrad(2500);
	   account1.deposit(3000);
	   System.out.print(account1);
	  }

	 }