import java.util.Scanner;
public class IFandElse {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter any integer number : ");
        num=input.nextInt();
        if(num>0){
            System.out.println("This is positive integer number");
        }
        else if(num<0){
            System.out.println("This is a negative integer number");
        }
        else{
            System.out.println("This number is zero");
        }

    }
}
