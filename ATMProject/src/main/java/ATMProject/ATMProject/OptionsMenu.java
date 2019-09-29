package ATMProject.ATMProject;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class OptionsMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	//DecimalFormat moneyFormat= new DecimalFormat("'")
	HashMap<Integer,Integer> data= new HashMap<Integer,Integer>();
	public void getLogin()throws IOException {
		int x=1;
		do
		{
			try {
				data.put(9876543, 9875);
				data.put(8989898, 1890);
				System.out.println("Welcome to the ATM Project");
				System.out.print("Enter your Customer Number:");
				setCustomerNumber(menuInput.nextInt());
				System.out.print("Enter your Pin Number:");
				setPinNumber(menuInput.nextInt());
				
				
			}catch(Exception e)
			{
				System.out.println("\n" +"Invalid Character(s).Only Numbers." +"\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry:data.entrySet())
			{
				if(entry.getKey()==getCustomerNumber()&& entry.getValue()==getPinNumber())
				{
				getAccountType();
					
				}
			}
	 System.out.println("\n"+"Wrong Customer Number or Pin NUmber." +"\n");
	} while(x==1);
}

/* Display Account Type Menu with Selection*/
public void getAccountType()
{
	System.out.println("Select the Account you want to Choose:");
	System.out.println("Type 1- Checking Account");
	System.out.println("Type 2- Savings Account");
	System.out.println("Type 3- Exit");
	System.out.println("Choice:");
	selection=menuInput.nextInt();
	switch(selection)
	{
	case 1:
		getChecking();
		break;
	case 2:getSaving();
	break;
	case 3: System.out.println("Thank you for using ATM.Bye");
	break;
	default:System.out.println("\n"+"Invalid Choice."+"\n");
	getAccountType();
	}
}
/*Display Checking Account Menu with Selections*/
public void getChecking()
{
	System.out.println("Checking Account:");
	System.out.println("Type 1- View Balance");
	System.out.println("Type 2- Withdraw Funds");
	System.out.println("Type 3- Deposit Funds");
	System.out.println("Exit");
	System.out.println("Choice:");
	selection =menuInput.nextInt();
	switch(selection)
	{case 1:
	System.out.println("Checking Account Balance: " +getCheckingBalance());
	getAccountType();
	break;
	case 2:
		getCheckingWithdrawInput();
		getAccountType();
		break;
	case 3: getCheckingDepositInput();
	getAccountType();
	break;
	case 4:System.out.println("Thank you for using ATM,bye.");
	break;
	default:System.out.println("\n"+"Invalid Choice:"+"\n");
			getChecking();
	
}
}
public void getSaving()

{
	System.out.println("Checking Account:");
	System.out.println("Type 1- View Balance");
	System.out.println("Type 2- Withdraw Funds");
	System.out.println("Type 3- Deposit Funds");
	System.out.println("Exit");
	System.out.println("Choice:");
	selection =menuInput.nextInt();
	switch(selection)
	{case 1:
	System.out.println("Saving Account Balance: " +getSavingBalance());
	getAccountType();
	break;
	case 2:
		getSavingWithdrawInput();
		getAccountType();
		break;
	case 3: getSavingDepositInput();
	getAccountType();
	break;
	case 4:System.out.println("Thank you for using ATM,bye.");
	break;
	default:System.out.println("\n"+"Invalid Choice:"+"\n");
			getChecking();
	
}
}
int selection;

}
