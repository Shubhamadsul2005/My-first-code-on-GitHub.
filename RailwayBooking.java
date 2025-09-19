class Node {
    int ticketNo;
    Node next;
    Node(int ticketNo) {
        this.ticketNo = ticketNo;
        this.next = null;
    }
}

class TicketList {
    Node head;
    void bookTicket(int ticketNo) {
        Node newNode = new Node(ticketNo);
        if (head == null) {
            head = newNode;
            System.out.println("Ticket booked: " + ticketNo);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Ticket booked: " + ticketNo);
    }
    void showTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet!");
            return;
        }
        System.out.print("Booked Tickets: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.ticketNo + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RailwayBooking
 {
    public static void main(String[] args) 
    {
        TicketList list = new TicketList();
        list.bookTicket(101);
        list.bookTicket(102);
        list.bookTicket(103);
        list.showTickets();
    }
 }