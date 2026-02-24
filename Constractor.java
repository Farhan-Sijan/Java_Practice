public class Constractor {
    
 private int value;

 public Constractor()
 {
    System.out.println("Defalt constractor is called ");
 }
   public Constractor (int i)
   {
      value=i;
      System.out.println("Pera miter is "+value);
   }
   public static void main(String[] args){

    Constractor c1=new Constractor();
    Constractor c2= new Constractor(200);
   }
}
