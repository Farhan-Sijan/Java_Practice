public class Variables {
    private  int Var=10;

    public int var=20;

    public static void main(String[] args){
        int b =10;

         for(int i=0;i<5;i++){
            System.out.println(i);
         }
         if(b%2==0){
            System.out.println("Even");
         }
         
         Variables v=new Variables();
         Variables v2=new Variables();
         
  System.out.println(v.var);
         System.out.println(v2.Var);
       
    }
	
}
