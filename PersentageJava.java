import java.util.Scanner;
public class PersentageJava {
  public static void main(String[] args){

   Scanner sc=new Scanner(System.in);
  System.out.println("Enter your physics marks : ");
  int physics=sc.nextInt();
  System.out.println("Enter your math number : ");
  int math=sc.nextInt();
  System.out.println("Enter your ip number : ");
  int ip=sc.nextInt();
  System.out.println("Enter your english number : ");
  int english=sc.nextInt();
  System.out.println("Enter your Bangla number : ");
  int bangla=sc.nextInt();
  
  float Persentage=((physics+math+ip+english+bangla)/500.0f)*100;
  System.out.println("Number of persentage is : "+Persentage);


  }
}
