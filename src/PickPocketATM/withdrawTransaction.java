package PickPocketATM;

public class withdrawTransaction {
	public void withdraw(double withdrawlAmount){
		
		 double masterNumber=1000000;
		 double balance=0;
		 balance= masterNumber-withdrawlAmount;
		 
		 System.out.println("Your new balance is :"+"$"+ balance);
		
	}
}
