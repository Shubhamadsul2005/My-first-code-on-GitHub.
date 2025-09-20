import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head;
    void append(int data)
    {
     
        Node n1=new Node(data);
        if(head==null)
        {
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null)   
        {
            temp=temp.next;
        }
        temp.next=n1;
    }
    void insert(int data,int pos)
    {
        Node n1=new Node(data);
        if(pos<1)
        {
            System.out.println("invalid position");
            return;
        }
        if(pos==1)
        {
            n1.next=head;
            head=n1;
            return;
        }
        Node temp=head;
        for(int i=1;temp!=null&&i<pos-1;i++)
        {
            
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("position is out of range");
            return;
        }
        n1.next=temp.next;
        temp.next=n1;
    }
    void delete( int value)
    {
        if(head==null)
        {
            System.out.println("Linkedlist is empty");            return;
        }
        Node temp=head;
        if(head.data==value)
        {
            head=head.next;
            return;
        }
        while(temp.next!=null&&temp.next.data!=value)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("data not present");
            return;
        }
      
        temp.next=temp.next.next;
    }
    void search(int value)
    {
        int flag=0;
        int count=1;
        Node temp=head;
        {
            for(int i=1;temp!=null&&i>0;i++)
            {
                if(temp.data==value)
                {
                    flag=1;
                    break;
                }
                count++;
                temp=temp.next;
            }
            if(flag==1)
            {
                System.out.println(value+" is present in and it's position is: "+count);
            }
            else
            {
                System.out.println(value+"not found");
            }
        }
    }
    void display()
    {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
    }
}
public class LinkedListAllOperation
{
    public static void main(String s[])
    {
    
        LinkedList l1 =new LinkedList();
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("enter 1 for append data");
            System.out.println("enter 2 for insert data");
            System.out.println("enter 3 for delete data");
            System.out.println("enter 4 for search data");
            System.out.println("enter 5 to exit");
            
       
        
            choice=sc.nextInt();
            switch(choice)
            {
            
                
            
                case 1:
                        System.out.println("enter data to append");
                        int dataadd=sc.nextInt();
                        l1.append(dataadd);
                        l1.display();
                        break;
                case 2:
                        System.out.println("enter data to be insert:");
                        int datain=sc.nextInt();
                        System.out.println("enter position");
                        int posi=sc.nextInt();
                        l1.insert(datain,posi);
                        l1.display();
                        break;
                case 3:
                        
                        System.out.println("enter data which you want to remove");
                        int dataout=sc.nextInt();
                        l1.delete(dataout);
                        l1.display();
                        break;
                case 4:
                        System.out.println("enter data to be search");
                        int searchdata=sc.nextInt();
                        l1.search(searchdata);
                case 5:
                        l1.display();
                        break;
                 default:
                         System.out.println("invalid choice");
            }
        }while(choice!=5);
         
            
            
        
    }
}


        
  
                                   
    


   


            
        
