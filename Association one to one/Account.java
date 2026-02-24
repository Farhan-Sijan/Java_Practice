public class Account{
       
    private int accountNum;
    private String accountHolderName;
    private double balance;

    public Account(){
        System.out.println("default cons");
}
public Account(int accountNum,String accountHoldername,double balance)
{
    this.accountNum=accountNum;
    this.accountHolderName=accountHoldername;
    this.balance=balance;
}
public void setAccountNum(int accountNum)
	{
		this.accountNum = accountNum;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public int getAccountNum()
	{
		return accountNum;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
    }

    public void showDetails()
	{
		System.out.println("Account number: " + accountNum);
		System.out.println("Account holder name: " + accountHolderName);
		System.out.println("Account number: " + balance);
	}
}