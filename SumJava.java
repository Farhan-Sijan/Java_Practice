import java.sql.SQLOutput;
import java.util.Scanner;

public class SumJava {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        int num1;
        int num2;
        System.out.println("Enter number 1 : ");
        num1=input.nextInt();
        System.out.println("Enter number 2 : ");
        num2=input.nextInt();
        int result=(num1+num2);
        int sub=(num1-num2);
        System.out.println("Your Result is : "+result);
        System.out.println("Your Result is : "+sub);


    }
}
