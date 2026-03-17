import java.util.*;
public class Twodarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eter row size of an array:-");
        int row=sc.nextInt();
                System.out.println("Eter column size of an array:-");

        int column= sc.nextInt();
        int[][] array=new int[row][column];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The given array is:-");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }

        
    }
    
}
