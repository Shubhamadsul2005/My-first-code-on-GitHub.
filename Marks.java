import java.util.Scanner;
class Marks
{
    static void bubbleSort(int []A, int n)
    {
        int temp;
        for(int i=0;i<n-1;i++)
        {   
            for(int j=0;j<n-1-i;j++) 
            {
                if(A[j]<A[j+1])
                {
                    temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
            
                           
        }
    }
    static void avgOperation(int  []A,int n)
    {
        System.out.println((A[1]+A[2]+A[0]-A[n-3]-A[n-1]-A[n-2])/3);
    }
    public static void main(String s[])
    {      
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements:");
        int n=sc.nextInt();       
        System.out.println("Enter array elements:");        int A[]=new int[n];   
        for(int i=0;i<n;i++)  
        {
            A[i]=sc.nextInt();
        }
        bubbleSort(A,n);
        avgOperation(A,n);
    }
}
        
        
        
        
