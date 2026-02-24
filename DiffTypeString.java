import java.util.Scanner;
public class DiffTypeString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name = "Farhan";
        System.out.println(name);
        int len=name.length();
        System.out.println(len);
        
       String lstring=name.toLowerCase();
       System.out.println(lstring);

       String ustring=name.toUpperCase();
       System.out.println(ustring);

       System.out.println(name.substring(2));
       System.out.println(name.substring(1,3));

       System.out.println(name.replace('r','n'));
       System.out.println(name.replace("r", "air"));
    }
}
