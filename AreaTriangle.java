import java.util.Scanner;
public class AreaTriangle {

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        double base,height,triangle,area;

        System.out.print("Enter base : ");
        base=input.nextDouble();

        System.out.print("Enter height : ");
        height=input.nextDouble();

        triangle=(0.5*base*height);
        area=(base*height);

        System.out.println("triangle = "+triangle);
        System.out.println("Area = "+area);
    }
}
