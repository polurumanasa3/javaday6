import java.util.*;
class p
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }
        }
}