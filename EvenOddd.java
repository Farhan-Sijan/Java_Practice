import java.util.Scanner;

public class EvenOddd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter an positive integer number : ");
        num=input.nextInt();

        if(num%2==0){
            System.out.println("It is a even integer number");
        }
        else{
            System.out.println("Its odd number");
        }

    }
}


