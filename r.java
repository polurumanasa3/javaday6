import java.util.*;
class r
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
            s+=arr[i];
        }
        int res=((n+1)*(n+2))/2;
        System.out.println(res-s);
        }
    }
