import java.util.Scanner;
class QuickSort1
{
    public static void quickSortRecursion(int A[],int low, int high)
    {
        if(low<high)
        {
            int p=partitionL( A,low,high);
            quickSortRecursion(A,low, p-1);
            quickSortRecursion(A,p+1,high);
        }
    }
    public static int partitionL(int A[],int low,int high)
    {
        int pivot=A[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(A[j]<=pivot)
            {
                i++;
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        int temp=A[i+1];
        A[i+1]=A[high];
        A[high]=temp;
        return i+1;
    }
    public static void display(int A[])
    {
        if(A==null)
        {
            System.out.println("array is empty");
        }
        else
        {
            System.out.println("sorted no are:");
            for(int i=0;i<A.length;i++)
            {
                System.out.print(A[i]+"\t");
            }
        }
    }

    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter count of number:");      
        int n=sc.nextInt();      
        int A[]=new int[n];
        System.out.println("enter no to sort");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        quickSortRecursion(A,0,n-1);
        display(A);
    }
}
        
    