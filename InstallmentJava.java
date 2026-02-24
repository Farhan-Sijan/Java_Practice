import java.util.Scanner;
public class InstallmentJava {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Phone price 24000 Tk");
        int phonePrice=24000;
        System.out.println("Enter your number of installment : ");
        int installment=input.nextInt();
        int Permonth=(phonePrice/installment);
        System.out.println("Your per month installment amount : "+Permonth);
    }
}
