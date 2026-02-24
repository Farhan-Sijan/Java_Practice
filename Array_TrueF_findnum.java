import java.util.Scanner;
public class Array_TrueF_findnum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        float marks[]={34.1f,23.1f,56.3f,87.2f};
        System.out.println("Enter an number : ");
        float num=sc.nextFloat();
        boolean array=false;
        for(float x:marks){
            if(num==x){
                array = true;
                break;
            }
        }
        if(array){
           System.out.println("This value is present in array");

        }
        else
        {
            System.out.println("This value is not  present in array");
        }
       

    }
}
