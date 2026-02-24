import java.util.Scanner;
public class Start {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

       System.out.println("Enter your phone number : ");
       String phoneN=sc.nextLine();

       System.out.println("Enter your array size : ");
       int arr=sc.nextInt();

       Customer c1=new Customer(phoneN,arr);

       
		Account a1 = new Account();
		System.out.println("Enter your account number : ");
        int num1=sc.nextInt();
        a1.setAccountNum(num1);
        sc.nextLine();

        System.out.println("Enter acc holder name : ");
        String holder1=sc.nextLine();
        a1.setAccountHolderName(holder1);

        System.out.println("Acc balance : ");
        int balance1=sc.nextInt();
        a1.setBalance(balance1);

      System.out.println("/////////////////////////////////");
       System.out.println("For account 2 : ");
        Account a2 = new Account();
            
        System.out.println("Enter your account number : ");
        int num2=sc.nextInt();
        a2.setAccountNum(num2);
        sc.nextLine();

        System.out.println("Enter acc holder name : ");
        String holder2=sc.nextLine();
        a2.setAccountHolderName(holder2);

        System.out.println("Acc balance : ");
        int balance2=sc.nextInt();
        a2.setBalance(balance2);
        
        System.out.println("/////////////////////////////////");
        System.out.println("For account 3 : ");
        Account a3 = new Account();

        System.out.println("Enter your account number : ");
        int num3=sc.nextInt();
        a3.setAccountNum(num3);
        sc.nextLine();

        System.out.println("Enter acc holder name : ");
        String holder3=sc.nextLine();
        a3.setAccountHolderName(holder3);

        System.out.println("Acc balance : ");
        int balance3=sc.nextInt();
        a3.setBalance(balance3);

        System.out.println("/////////////////////////////////");
        System.out.println("For account 4 : ");
        Account a4 = new Account();

        System.out.println("Enter your account number : ");
        int num4=sc.nextInt();
        a4.setAccountNum(num4);
        sc.nextLine();

        System.out.println("Enter acc holder name : ");
        String holder4=sc.nextLine();
        a4.setAccountHolderName(holder4);

        System.out.println("Acc balance : ");
        int balance4=sc.nextInt();
        a4.setBalance(balance4);

        System.out.println("/////////////////////////////////");
        System.out.println("For account 5 : ");
        Account a5 = new Account();

        System.out.println("Enter your account number : ");
        int num5=sc.nextInt();
        a5.setAccountNum(num5);
        sc.nextLine();

        System.out.println("Enter acc holder name : ");
        String holder5=sc.nextLine();
        a5.setAccountHolderName(holder5);

        System.out.println("Acc balance : ");
        int balance5=sc.nextInt();
        a5.setBalance(balance5);

        System.out.println("/////////////////////////////////");
        System.out.println("For account 6 : ");
        Account a6 = new Account();

        System.out.println("Enter your account number : ");
        int num6=sc.nextInt();
        a6.setAccountNum(num6);
        sc.nextLine();

        System.out.println("Enter acc holder name : ");
        String holder6=sc.nextLine();
        a6.setAccountHolderName(holder6);

        System.out.println("Acc balance : ");
        int balance6=sc.nextInt();
        a6.setBalance(balance6);

        System.out.println();

        c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a4);
		c1.insertAccount(a5);
		c1.insertAccount(a6);

        c1.showAllAccounts();
		
		c1.removeAccount(a2);
        c1.showAllAccounts();
        System.out.println("/////////////////////////////////");
    }
}
