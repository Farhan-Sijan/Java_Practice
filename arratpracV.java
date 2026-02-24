import java.util.Scanner;
public class arratpracV {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("1 st");
     
    int arr1[][]=new int[][]{{11,22,33,44},{33,55,66,77}};

      for(int i=0;i<2;i++)
      {
        for(int j=0;j<4;j++)
        {
            System.out.println(arr1[i][j]+" ");
        }
}

        System.out.println("2nd ");
         System.out.println(); 

              int arr2[][]=new int[2][3];

              for(int i=0;i<2;i++)
              {
                for(int j=0;j<3;j++)
                {

                    arr2[i][j]=sc.nextInt();
                }
              }
              for(int i=0;i<2;i++)
              {
                for(int j=0;j<3;j++)
                {

                    System.out.println(arr2[i][j]+" ");
                }
                System.out.println();
              }
                    int arr3[][];
                    System.out.println("enter raw number : ");
                    int raw=sc.nextInt();
                    System.out.println("Enter the col number ; ");
                    int col=sc.nextInt();
                     arr3=new int[raw][col];

                     for(int i=0;i<raw;i++)
                     {
                        for(int j=0;j<col;j++)
                        {

                            arr3[i][j]=sc.nextInt();
                        }
                     }
                     
                     for(int i=0;i<raw;i++)
                     {
                        for(int j=0;j<col;j++)
                        {

                           System.out.println(arr3[i][j]+" ");
                        }
                     }
                       

    }
}
