public class UnaryDemo {
    public static void main(String[] args){
        int x=-10;
        int result;

        result=+x;
        System.out.println("Result : "+result);

        result=-x;
        System.out.println("Result : "+result);

        int z=25;
        int y;
        y= z++;
        System.out.println("Y = "+y);
       y=z;
        System.out.println("z = "+y);
        y=++z;
        System.out.println("y = "+y);
        y=z;
        System.out.println("Y = "+y);


    }
}
