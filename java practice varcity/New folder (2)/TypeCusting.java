public class TypeCusting {
    public static void main(String[] args)
    {
      char c1='a',c2='b';
      float f1=5.5F,f2=10.5F;

      System.out.println("Implicit type custing ");
      f1=c1;
      System.out.println(f1);

      System.out.println("Explicit type custing ");
      c2=(char)f2;
      System.out.println(c2);

    }
}
