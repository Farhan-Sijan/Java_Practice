import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    float marks[]={12.2f+43.4f+76.6f+66.3f+98.2f+23.1f};
    float sum=0;
    for(float x:marks){
       sum=sum+x;
    }
    System.out.println("total value is : "+sum );

    }
}
