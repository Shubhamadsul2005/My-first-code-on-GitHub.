import java.util.Scanner;
class Search
{
    public static void bubbleSort(int A[],int n)
    {
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }
    public static int binarySearch(int B[],int x,int left,int right)
    {
        while(left<=right)
        {
                 int mid=(left+right)/2;
                 if(B[mid]==x)
                 {
                     return mid;
                 }
                 else if(B[mid]<x)
                 {
                     left=mid+1;
                 }
                 else
                 {
                     right=mid-1;
                 }             
        }
         return -1;
    }
    public static void display(int A[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
    }
    
}
class BinarySearch
{
      public static void main(String s[])
      {    
          Scanner sc=new Scanner(System.in);
          System.out.println("enter size of an array");
          int n=sc.nextInt();
          System.out.println("enter elements");
          int A[]=new int [n];
          for(int i=0;i<n;i++)
          {   
              A[i]=sc.nextInt();
          }
          System.out.println("sorted array:");
          Search.bubbleSort(A,n);
          Search.display(A,n);
          System.out.println();                    
          System.out.println("enter element to be search");
          int x=sc.nextInt();
          int p=Search.binarySearch(A,x,0,n-1);
          if(p==-1)
          {
              System.out.println("element not found");
          }
          else
          {
              System.out.println("element found");
          }
      }
}
          
          
              
                            
                                
                     
                     
                 
                 
                        
    
        