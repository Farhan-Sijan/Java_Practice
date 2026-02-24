import java.util.Scanner;
public class Stu_Pass_Fail {
    public static void main(String[] args){
        java.util.Scanner sc=new Scanner (System.in);

        float m1,m2,m3;

         System.out.print("Enter your Physics marks : ");
         m1=sc.nextFloat();
         System.out.print("Enter your Chemistry number : "); 
         m2=sc.nextFloat();
         System.out.print("Enter your Java number : ");
         m3=sc.nextFloat();

         float avg=(m1+m2+m3)/3.0f;
         System.out.println("Your avarage marks is : "+avg);

         if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations! your are passed the Examination");
         }
         else{
            System.out.println("Sorry! You are failed in this examination");
         }
    }
}
