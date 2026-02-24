public class Bool_If {
    public static void main(String[] args){
         
        System.out.println("For Logical And Operator : ");
        boolean a =true;
        boolean b= true;
        boolean c = false;

        if(a && b && c){
           System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Loogical OR oparetor : ");
         
        boolean a1=false;
        boolean b1 = true;
        boolean c1 = false;

          if(a || b || c){
            System.out.println("Y");
          }
          else{
            System.out.println("N");
          }
          System.out.println("For Logocal NOT");
          System.out.println("NOT(a) : "+!a);
          System.out.println("NOT(a) : "+!a1);

    }
}
