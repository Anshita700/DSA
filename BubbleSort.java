import java.util.*;
public class BubbleSort
{
public static void main(String gg[])
{
int arr[]={13,46,24,52,20,9};
int n=arr.length;
bubblesort(arr,n);
}
static void bubblesort(int arr[], int n)
{
for(int i=n-1;i>0;i--)
{
for(int j=i;j<=i-1;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
for(int i=0; i<n;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println();
}
}