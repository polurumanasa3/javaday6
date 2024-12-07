import java.util.*;
class o
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        int s=1;
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
            s*=arr[i];
        }
        System.out.println(s);
    }
        }