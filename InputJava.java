
import java.util.Scanner;

public class InputJava {

    public static void main(String[] args){

        Scanner input =new Scanner(System.in);

        String name;
        System.out.print("Enter your name : ");
        name= input.nextLine();
        System.out.println("Welcome : "+name);

        int number;
        System.out.print("Enter an any number : ");
        number = input.nextInt();

        System.out.println("numbers ="+number);



    }

}
