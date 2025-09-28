import java.util.Scanner;
class QuickSort2
{
    public static void quickSortRec(int A[],int low,int high)
    {
        if(low<high)
            {            
            int p=partitionF(A,low,high);        
            quickSortRec(A,low,p-1);
            quickSortRec(A,p+1,high);
            }
        }
    public static int partitionF(int A[],int low,int high)
    {
        int i=low+1;
        int j=high;
        int pivot=A[low];
        while(true)
        {
            while(i<=j&&A[i]<=pivot)
            {
                i++;
            }
            while(i<=j&&A[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
            else
            {
                break;
            }
        }
        if(i>j)
        {
            int temp=A[j];
            A[j]=A[low];
            A[low]=temp;
        }
        return j;
    }
    public static void display(int A[])
    {
        System.out.println("sorted no are :");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"\t");
        }
    }
    public static void main(String s[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter count of number: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter no to be sorted:");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        quickSortRec(A,0,n-1);
        display(A);
        sc.close();
    }
}

    
        
    
