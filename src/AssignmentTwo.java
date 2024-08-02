public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
    }

    public void partThree() {
        Ride ride = new Ride("Roller Coaster", 5);
        Visitor visitor1 = new Visitor("Alice", 25, "alice@example.com", "V001", "Gold");
        Visitor visitor2 = new Visitor("Bob", 30, "bob@example.com", "V002", "Silver");

        ride.AddVisitorToQueue(visitor1);
        ride.AddVisitorToQueue(visitor2);

        ride.PrintQueue();
        ride.RemoveVisitorFromQueue(visitor1);
        ride.PrintQueue();
    }

    public void partFourA() {
        Ride ride = new Ride("Ferris Wheel", 6);
        Visitor visitor1 = new Visitor("Charlie", 20, "charlie@example.com", "V003", "Gold");
        Visitor visitor2 = new Visitor("Daisy", 35, "daisy@example.com", "V004", "Silver");

        ride.AddVisitorToQueue(visitor1);
        ride.AddVisitorToQueue(visitor2);

        ride.RunOneCycle();
        ride.PrintRideHistory();
    }

    public void partFourB() {
        Ride ride = new Ride("Haunted House", 3);
        Visitor visitor1 = new Visitor("Eve", 40, "eve@example.com", "V005", "Gold");
        Visitor visitor2 = new Visitor("Frank", 22, "frank@example.com", "V006", "Silver");
        Visitor visitor3 = new Visitor("Grace", 28, "grace@example.com", "V007", "Gold");

        ride.AddVisitorToQueue(visitor1);
        ride.AddVisitorToQueue(visitor2);
        ride.AddVisitorToQueue(visitor3);

        ride.RunOneCycle();
        ride.PrintRideHistory();
    }
}
