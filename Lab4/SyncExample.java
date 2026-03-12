package Lab4;

class TicketBooking {
    int tickets = 5;

    synchronized void bookTicket(int n) {
        if (tickets >= n) {
            System.out.println("Booking " + n + " tickets");
            tickets = tickets - n;
            System.out.println("Tickets left: " + tickets);
        } else {
            System.out.println("Not enough tickets");
        }
    }
}

class Passenger extends Thread {
    TicketBooking t;

    Passenger(TicketBooking t) {
        this.t = t;
    }

    public void run() {
        t.bookTicket(3);
    }
}

public class SyncExample {
    public static void main(String[] args) {
        TicketBooking obj = new TicketBooking();
        Passenger p1 = new Passenger(obj);
        Passenger p2 = new Passenger(obj);

        p1.start();
        p2.start();
    }
}