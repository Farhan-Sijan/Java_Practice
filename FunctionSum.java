public class FunctionSum {
    private int math;

    public int sum(int a,int b)
    {
        math=a+b;
        return math;
    }
    
    public int mul (int z,int x)
    {
        math=z*x;
        return math;
    }
     
    public int sub(int a,int b)
    {
        math=a-b;
        return math;
    }
    public static void main(String[] args)
    {
        FunctionSum f1=new FunctionSum();
        int result_1=f1.sum(2, 3);

        FunctionSum f2=new FunctionSum();
        int result_2=f2.mul(5,2);

        FunctionSum f3=new FunctionSum();
        int result_3=f3.sub(5, 3);

        System.out.println("The result of sum is : "+f1.math);
        System.out.println("The result of sum is : "+f2.math);
        System.out.println("The result of sum is : "+f3.math);
    }

}
