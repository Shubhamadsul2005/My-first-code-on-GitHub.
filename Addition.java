import java.util.Scanner;
class Addition
{
    static void add(int x,int y)
    {
        System.out.print("sum of 2 numbers is:"+(x+y));
    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no:");
        int x=sc.nextInt();
        System.out.print("Enter second no:");
        int y=sc.nextInt();
        Addition.add(x,y);
    }
}