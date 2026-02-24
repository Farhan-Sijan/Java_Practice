import java.util.Scanner;

public class arrayVarcity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("First array : ");
        System.out.println();

        int arry1[]=new int[5];

        for(int i=0;i<5;i++){
            arry1[i]=sc.nextInt();
        }

        for(int i=0 ; i<5; i++){
            System.out.println(arry1[i]+ " ");
        }

        System.out.println();
		System.out.println();
		System.out.println("1D array");
		System.out.println("Approach - 2 (values are known to us)");

        int arr2[]=new int[]{111,222,333,444,555};

        for (int i=0; i<5;i++){
            System.out.println(arr2[i]+" ");
        }
         
        System.out.println();
		System.out.println();
		System.out.println("1D array");
		System.out.println("Approach - 3 (Size and values both are unknown to us)");  

          int arr3[];
          System.out.println("Enter array size :");
          int size= sc.nextInt();
          arr3=new int[size];
         

          for (int i = 0; i < size; i++) {
            arr3 [i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr3[i] + " ");
        }
        System.out.println();
		System.out.println();
		System.out.println("2D array");
		System.out.println("Approach - 1 (Size is known to us)");
          
        int arr4[][]=new int [2][3];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr4[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr4[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
		System.out.println();
		System.out.println("2D array");
		System.out.println("Approach - 2 (values are known to us)");

        int arr5[][]=new int[][]{{111,222,333},{555,66,777}};

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr5[i][j]+" ");
            }

            System.out.println();
        }
        System.out.println();
		System.out.println();
		System.out.println("2D array");
		System.out.println("Approach - 3 (Size and values both are unknown to us)");
          
        int arr6[][];
        System.out.println("Enter raw array size : ");
        int rawsize=sc.nextInt();
        System.out.println("Enter colm size :");
        int colsize=sc.nextInt();

        arr6=new int[rawsize][colsize];

        for(int i=0;i<rawsize; i++)
        {
            for(int j=0;j<colsize;j++)
            {
                arr6[i][j]=sc.nextInt();
            }
        }
             for(int i=0 ; i<rawsize;i++)
             {
                for(int j=0;j<colsize;j++)
                {
                    System.out.print(arr6[i][j]+ " ");
                }
                System.out.println();
             }
       

    }
}
