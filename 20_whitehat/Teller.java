/*
Emily Ortiz
APCS
HW20 - External Audit
2021-10-20

DISCO
- (short) is needed in front of the PIN, otherwise an error occurs

QCC

*/



public class Teller{

	public static void main(String [] args) {
		BankAccount ba = new BankAccount ();	
		ba.setName("frist lsat");
		ba.setID(123456789);
		ba.setBalance(100);
		ba.setPassword("password");
		ba.setPIN((short) 1234);
		
		System.out.println(ba.toString());
		
		// authentication test
		ba.authenticate(123456789, "password");
		
		// deposit test
		ba.deposit(100);
		System.out.println("Deposit\n" + ba.toString());

		// withdraw test
		ba.withdraw(500);
		ba.withdraw(50);
		System.out.println("Withdraw\n" + ba.toString());
	}

}
