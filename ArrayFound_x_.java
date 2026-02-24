import java. util.Scanner;
public class ArrayFound_x_ {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       
      System.out.println("Enter raw numbers : ");
       int raw=sc.nextInt();
      System.out.println("Enter colum numbers : ");
       int col=sc.nextInt();

       int num[][]=new int [raw][col];

       for(int i=0;i<raw;i++){
        for(int j=0;j<col;j++){
          num[i][j]=sc.nextInt();
        }
       }
       System.out.println("Enter any number from the matrix : ");
       int x=sc.nextInt();

          for(int i=0;i<raw;i++){
            for(int j=0;j<col;j++){
              if(num[i][j]==x){
                System.out.println("x found at location : "+i+" , "+j);
              }
            }
          }
       
    }
}
