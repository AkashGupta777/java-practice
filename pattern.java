import java.util.Scanner;

public class pattern {
    
    
    public static void main (String [] args)
    {
        int i,j,row=8;
        Scanner sc = new Scanner (System.in);
        for( i=row; i>=1 ;i--)
        {
           for(j=1;j<=i;j++)
           {
            System.out.print("*");
           }
           System.out.println();
        }


        sc.close();

    }
    

    

}