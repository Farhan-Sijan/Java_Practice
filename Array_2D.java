import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter rows numbers : ");
        int rows=sc.nextInt();
        System.out.println("Enter colms numbers : ");
        int cols=sc.nextInt();

        int num[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                num[i][j]=sc.nextInt();
            }
        }

        //Output
         System.out.println("The Matrix is ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); 
        }
       
    }
}
