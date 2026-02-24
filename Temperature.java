import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        double cels,farn;
       System.out.print("Enter any celcious value : ");
       cels=input.nextDouble();
       farn=1.8 * cels + 32;

       System.out.println("Your faren vale is : "+farn);


        
    }
}
