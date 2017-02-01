package PickPocketATM;

public class depositTransaction {
	public void deposit(double lodgeAmount ){
		
		double masterNumber=1000000;
		double balance=0;
		balance=masterNumber+ lodgeAmount;
		
		System.out.println("Your new balance is :" + "$"+balance);

	}
}
