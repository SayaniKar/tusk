package ATMProject.ATMProject;
import java.util.*;


public class Account {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
Scanner input=new Scanner(System.in);
public int setCustomerNumber(int customerNumber)
{
	this.customerNumber=customerNumber;
	return customerNumber;
	
}
public int getCustomerNumber()
{
	return customerNumber;
}
public int setPinNumber(int pinNumber)
{
	this.pinNumber=pinNumber;
	return pinNumber;
}
public int getPinNumber()
{
	return pinNumber;
}
public double  getCheckingBalance()
{
	
	return checkingBalance;
}
public double getSavingBalance()
{
	return savingBalance;
}
public double calcCheckingWithdraw(double amount)
{
	checkingBalance =(checkingBalance-amount);
	return checkingBalance;
}
public double calcSavingWithdraw(double amount)
{
	savingBalance =(savingBalance - amount);
	return savingBalance;
	
}

public double calcCheckingDeposit(double amount)
{
	checkingBalance =(checkingBalance+amount);
	return checkingBalance;
}
public double calcSavingDeposit(double amount)
{
	savingBalance =(savingBalance + amount);
	return savingBalance;
	
}
public void getCheckingWithdrawInput()
{
	System.out.println("Checking Accont Balance:"+checkingBalance);
	System.out.println("Amount you want to withdraw from checking Account");
	double amount= input.nextDouble();
	if((checkingBalance-amount)>=0)
	{
		calcCheckingWithdraw(amount);
		System.out.println("New checking Account Balance:"+checkingBalance);
	}
	else
	{
		System.out.println("Balance can't be negative");
		
	}
}
public void getSavingWithdrawInput()
{
	System.out.println("Checking Accont Balance:"+savingBalance);
	System.out.println("Amount you want to withdraw from checking Account");
	double amount= input.nextDouble();
	if((savingBalance-amount)>=0)
	{
		calcSavingWithdraw(amount);
		System.out.println("New checking Account Balance:"+savingBalance);
	}
	else
	{
		System.out.println("Balance can't be negative");
		
	}
}
public void getCheckingDepositInput()
{
	System.out.println("Checking Account Balance:"+checkingBalance);
	System.out.println("Amount you want to deposit to checking Account");
	double amount= input.nextDouble();
	if((checkingBalance+amount)>=0)
	{
		calcCheckingWithdraw(amount);
		System.out.println("New checking Account Balance:"+checkingBalance);
	}
	else
	{
		System.out.println("Balance can't be negative");
		
	}
}
public void getSavingDepositInput()
{
	System.out.println("Checking Accont Balance:"+savingBalance);
	System.out.println("Amount you want to Deposit  to  Saving Account");
	double amount= input.nextDouble();
	if((savingBalance+amount)>=0)
	{
		calcSavingWithdraw(amount);
		System.out.println("New checking Account Balance:"+savingBalance);
	}
	else
	{
		System.out.println("Balance can't be negative");
		
	}
}
private int customerNumber;
private int pinNumber;
private double checkingBalance=0;
private double savingBalance=0;
}
