import java.util.Scanner;
public class start {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);

       box b1=new box();
       box b2=new box();
       
       System.out.println("Enter higth , witdh ,length for b1 : ");
       b1.setlength(sc.nextDouble());
       b1.setWidth(sc.nextDouble());
       b1.setHigth(sc.nextDouble());
      b1.display();
      
      System.out.println("Enter higth , witdh ,length for b2 : ");
       b2.setlength(sc.nextDouble());
       b2.setWidth(sc.nextDouble());
       b2.setHigth(sc.nextDouble());
         b2.display();

          box arr[]=new box[10];

          arr[0]=b1;
          arr[3]=b2;

          for(int i=0;i<10;i++)
    {
        if(arr[i]!=null)
        {
            System.out.println("length : "+i +" "+arr[i].getLength());
            System.out.println("Witdh : "+i+" "+arr[i].getWidth());
            System.out.println("Higth : "+i+" "+arr[i].getHeigth());

        }
        
        else{
            System.out.println("no information is found! : "+i);
        }

    }


    }
}
