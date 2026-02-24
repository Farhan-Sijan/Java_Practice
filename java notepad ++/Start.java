import java.lang.*;
     public class Start
     {
        public static void main(String [ ] a)
          {
            Book obj1=new Book();
             obj1.setIsbn("1234");
              obj1.setbookTitle("Java");
                obj1.setauthorName("B");
                     obj1.setPrice(50);
                  obj1.setavailableQuantity(10);
                   System.out.println("BookTitle :"+obj1.getBookTitle());
                   Book obj2=new Book();
                    obj2.showDetails();
                                   obj2.setIsbn("123");
              obj2.setbookTitle("D");
                obj2.setauthorName("Y");
                     obj2.setPrice(30);
                  obj2.setavailableQuantity(7);
                    
                System.out.println("Value of add and sell quantity :"+obj2.getAvailableQuantity());
           }
          }
