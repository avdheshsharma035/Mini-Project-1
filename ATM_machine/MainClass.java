package ATM_machine;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) 
	{
		AtmOperationInterface op = new AtmOperationImpl(); 
		int atmnumber = 12345;
		int atmpin = 1234;
		
		Scanner in = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("************Welcome to ATM Machine************");
		System.out.print("Enter Atm Number : ");
		int atmNumber = in.nextInt();
		System.out.print("Enter Your Pin : ");
		int pinNumber = in.nextInt();
		
		if((atmnumber==atmNumber)&&(atmpin==pinNumber))
		{
			while(true) {
				System.out.println("1.View Available Balance\n2.withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
				System.out.println("Enter the Choice : ");
				int ch = in.nextInt();
				if(ch==1) 
				{
					op.viewBalance();
				}
				else if(ch==2) 
				{
					System.out.println("Enter Amount to Withdraw");
					double withdrawAmount = in.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3) 
				{
					System.out.println("Enter Amount to Deposit : ");
					double depositAmount=in.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(ch==4) 
				{
					op.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Collect your ATM Card\n Thank you for using ATM Machine");
					System.exit(0);
					
				}
				else {
					System.out.println("Please Enter Correct Choice");
				}
			}
		}
		else 
		{
		    System.out.println("Incorrect ATM Number or Pin");
		    
		}
	}
}
