public class Varargs {

    static int sum(int ...arr){
        int result=0;
        for(int a:arr){

            result+=a;
        }
        return result;

    }
    public static void main(String[] args){
           
        System.out.println("The sum of 7 and 8 is "+sum(7,8));
        System.out.println("Tje sum of 9 and 10 is "+sum( 9,10));
    }
}
