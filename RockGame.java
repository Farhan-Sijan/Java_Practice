import java.util.Scanner;
import java.util.Random;

public class RockGame {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock, Enter 1 for paper, Enter 2 for scissor");
        int my=sc.nextInt();

        Random rn=new Random();
        int computer=rn.nextInt(3);

        if (my == computer) {
            System.out.println("This match is a draw!");
            System.out.println("Computer Choice : "+computer);
        } 
        else if (my == 0 && computer == 1) {
            System.out.println("Computer win! You lost this game.");
            System.out.println("Computer Choice : "+computer);
        }
        else if(my == 1 && computer == 2){
            System.out.println("Computer win! You lost this game.");
            System.out.println("Computer Choice : "+computer);
        }
        else if(my == 2 && computer == 0){
            System.out.println("Computer win! You lost this game.");
            System.out.println("Computer Choice : "+computer);
        }
        else{
            System.out.println("YOu win this game!");
            System.out.println("Computer Choice : "+computer);
        }
    }
}