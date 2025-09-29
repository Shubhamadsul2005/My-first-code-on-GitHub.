class Call
{
    int maxsize;
    int Aid[];
    int At[];
    int rear;
    int front;
    int count;
    Call(int size)
    {
        maxsize=size;
        Aid=new int[maxsize];
        At=new int[maxsize];
        rear=-1;
        front=0;
        count=0;
    }
    public void addCall(int id,int calltime)
    {
        if(count==maxsize)
        {
            System.out.println("wait for some time call list is full");
        }
        else
        {
            rear=(rear+1)%maxsize;
            Aid[rear]=id;
            At[rear]=calltime;
            System.out.println("customer "+id+" talk for"+calltime+"min");
            count++;
        }
    }
    public void answerCall()
    {
        if(count==0)
        {
            System.out.println("call list is empty");
        }
        else
        {
            System.out.println("Next call id :"+ Aid[front]);
            front=(front+1)%maxsize;
            count--;
        }
    }
    public void viewCall()
    {
            System.out.println("Call list:");
            for(int i=0;i<count;i++)
            {
                int index=(front+i)%maxsize;
                System.out.println("Id:"+Aid[index]+" call time:"+At[index] +" min");
            }
    }
}
class CallCenter
{
        public static void main(String s[])
        {
            Call c=new Call(5);
            c.addCall(100,5);
            c.addCall(101,10);
            c.addCall(102,10);
            c.addCall(103,10);         
            c.addCall(104,10);
            c.answerCall();
            c.addCall(105,5);
            c.answerCall();
            c.viewCall();
        }
}
            
    
            
            
        