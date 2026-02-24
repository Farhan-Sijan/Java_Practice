public class Customer {
    private String phoneNum;
    private Account account;

public Customer()
{
    System.out.println("Default Cons");
}

public Customer(String phoneNum,Account account)
{
    this.phoneNum=phoneNum;
    this.account=account;
}
public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public void setAccount(Account account)
	{
		this.account = account;
	}
	
	public String getPhoneNum()
	{
		return phoneNum;
	}
	public Account getAccount()
	{
		return account;
	}

    public void showdetails()
    {
        System.out.println("phone number : "+phoneNum);
        account.showDetails();
    }
}
