import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(j==0 || i==j || j==n-1 || i+j==n-1)
                System.out.print("*"+" ");
                else
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
