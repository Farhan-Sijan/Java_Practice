import java.util.Scanner;
public class Votarcheck {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int voter;
        System.out.println("Enter your age : ");
        voter=input.nextInt();
        if(voter>=18) {
            System.out.print("You are avilable for vote");
        }
        else{
            System.out.println("You are not avilable for vote");
        }
        }
    }

