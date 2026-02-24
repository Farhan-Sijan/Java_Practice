public class string {
    public static void main(String[] args)
    {
       String s1=new String("Hello");
       String s2="Hello";

       System.out.println(s1+s2);

       int age=20;
      String massage=("Im "+age+"Years old");
      System.out.println(massage);

      String text="Farhan Hasin, Sijan";

      System.out.println("Length of the String is : "+text.length());
      System.out.println("Charecter at index 10 : "+text.charAt(10));

      String anotherText="Farhan, Hasin";

      String text2="hello, univers";

      
      System.out.println("Are the strings equal? " + text.equals(anotherText));
      System.out.println("Index of H : "+text.indexOf('j'));
      System.out.println("Index of Hasin  : "+text.indexOf("Sijan"));
      System.out.println("SubString from index 8 :"+text.substring(14) );
      System.out.println("SubString for 0 to 7 : "+text.substring(0,10));
      System.out.println("UpperCase : "+text.toUpperCase());
      System.out.println("LowerCase : "+text.toLowerCase());
     



    }
}
