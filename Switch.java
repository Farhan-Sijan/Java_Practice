import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner imput=new Scanner(System.in);
        int digit;
        System.out.print("Enter any digit : ");
        digit=imput.nextInt();

        switch (digit){

            case 0:
                System.out.println("Zero");
                break;
                case 1:
                System.out.println("ONE");
                break;
                case 2:
                System.out.println("tWO");
                break;
                case 3:
                System.out.println("tHREE");
                break;
                case 4:
                System.out.println("Four");
                break;
                case 5:
                System.out.println("Five");
                break;
                case 6:
                System.out.println("Six");
                break;
                case 7:
                System.out.println("Seven");
                break;
                case 8:
                System.out.println("Eight");
                break;
                case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("This is not a digit");
                
        }
    }
}
