import java.util.Scanner;
public class Start {
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter account number : ");
     int accountNum = sc.nextInt();
    sc.nextLine();

     System.out.println("Enter account Holder Name : ");
     String accountHolderName = sc.nextLine();

     System.out.println("Enter Balance : ");
     double balance = sc.nextDouble();
    sc.nextLine();

     Account a1 = new Account(accountNum,accountHolderName,balance);

     System.out.print("Enter Phone Number: ");
     String phoneNum = sc.nextLine();
     

     Customer c1 = new Customer(phoneNum, a1);

     System.out.println("Customer detail : ");
     c1.showdetails();

     System.out.println("Detail for  2nd account : ");
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println("Enter account number 2 : ");
     int accountNum2=sc.nextInt();
     sc.nextLine();

     System.out.println("Enter account Holder Name 2 : ");
     String accountHolderName2 = sc.nextLine();

     System.out.println("Enter Balance 2 : ");
     double balance2 = sc.nextDouble();
    sc.nextLine();

    Account a2=new Account(accountNum2,accountHolderName2,balance2);

    System.out.println("Enter phone number 2 : ");
    String phoneNum2 = sc.nextLine();

    Customer c2=new Customer(phoneNum2,a2);
    c2.showdetails();



    
    }
}