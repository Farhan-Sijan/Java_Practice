import java.util.Scanner;
public class Multi_8_Sum {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int num =sc.nextInt();
      int sum=0;
      for(int i=1;i<=10;i++){
        sum=sum+(num*i);
      } 
      System.out.println(sum);
    }
}
