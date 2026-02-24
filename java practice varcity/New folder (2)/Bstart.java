public class Bstart {
    public static void main(String [] args)
    {
        Box b1=new Box();
        Box b2 =new Box();

        b1.setLength(43);
        b1.setWidth(12);
        b1.setHeigth(54);

        b2.setLength(76);
        b2.setWidth(34);
        b2.setHeigth(87);


        Box arr[]=new Box [10];

        arr[0]=b1;
        arr[3]=b2;

        for(int i=0;i<10;i++)
        {
            if(arr[i]!=null)
            {
                 System.out.println("box  length : "+  i +" " +arr[i].getLength());
                 System.out.println("box  witdh : "+  i +" " +arr[i].getWidth());
                 System.out.println("box  heigth : "+  i +" " +arr[i].getHeigth());
            }
            else{System.out.println("no box found "+i);}
        }
        System.out.println();
    }
}
