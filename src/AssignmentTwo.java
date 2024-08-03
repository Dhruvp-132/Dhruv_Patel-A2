//Assignment 2
public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
    }

    public void partThree() {
        Ride ride = new Ride("Roller Coaster", 5);
        Visitor visitor1 = new Visitor("Jack", 25, "jack@gmail.com", "M001", "Roller Coaster");
        Visitor visitor2 = new Visitor("Sharon", 30, "sharon@gmail.com", "M002", "Roller Coaster");
        Visitor visitor3 = new Visitor("Benny", 28, "benny@gmail.com", "M003", "Roller Coaster");
        Visitor visitor4 = new Visitor("Leo", 22, "leo@gmail.com", "M004", "Roller Coaster");
        Visitor visitor5 = new Visitor("Tom", 26, "tom@gmail.com", "M005", "Roller Coaster");

        ride.AddVisitorToQueue(visitor1);
        ride.AddVisitorToQueue(visitor2);
        ride.AddVisitorToQueue(visitor3);
        ride.AddVisitorToQueue(visitor4);
        ride.AddVisitorToQueue(visitor5);

        ride.PrintQueue();
        ride.RemoveVisitorFromQueue(visitor1);
        ride.RemoveVisitorFromQueue(visitor2);
        ride.PrintQueue();
        System.out.println("------------------------");
    }

    public void partFourA() {
        {
            Ride ride = new Ride("Roller Coaster", 5);
            Visitor visitor1 = new Visitor("Charlie", 20, "charlie@gmail.com", "V003", "Gold");
            Visitor visitor2 = new Visitor("Daisy", 35, "daisy@gmail.com", "V004", "Silver");
            Visitor visitor3 = new Visitor("Emma", 25, "emma@gmail.com", "V005", "Gold");
            Visitor visitor4 = new Visitor("Frank", 22, "frank@gmail.com", "V006", "Silver");
            Visitor visitor5 = new Visitor("George", 28, "george@gmail.com", "V007", "Gold");

            ride.AddVisitorToRideHistory(visitor1);
            ride.AddVisitorToRideHistory(visitor2);
            ride.AddVisitorToRideHistory(visitor3);
            ride.AddVisitorToRideHistory(visitor4);
            ride.AddVisitorToRideHistory(visitor5);

            System.out.println("Is Charlie in ride history? " + ride.CheckVisitorInRideHistory(visitor1));
            System.out.println("Number of visitors in ride history: " + ride.GetNumberOfVisitorsInRideHistory());

            ride.PrintRideHistory();
            System.out.println("------------------------");
        }
    }

    // Part 4B

    public void partFourB() {
        Ride ride = new Ride("Roller Coaster", 3);
        Visitor visitor1 = new Visitor("Eve", 40, "eve@gmail.com", "V005", "Gold");
        Visitor visitor2 = new Visitor("Frank", 22, "frank@gmail.com", "V006", "Silver");
        Visitor visitor3 = new Visitor("Eve", 40, "grace@gmail.com", "V007", "Gold");
        Employee rideOperator = new Employee("John",35, "John@gmail.com","1","Ride Operator");
        ride.setRideOperator(rideOperator); // Assign the ride operator
        ride.AddVisitorToQueue(visitor1);
        ride.AddVisitorToQueue(visitor2);
        ride.AddVisitorToQueue(visitor3);

        ride.RunOneCycle(); // Run the ride cycle to populate the ride history

        System.out.println("Ride history before sorting:");
        ride.PrintRideHistory();

        // Sort the collection
        ride.SortRideHistory();

        // Print all Visitors in the collection again to show that the collection has been sorted
        System.out.println("Ride history after sorting:");
        ride.PrintRideHistory();
    }

// Part5
    public void partFive() {
        Ride ride = new Ride("Roller Coaster", 3);
        Visitor visitor1 = new Visitor("Eve", 40, "eve@gmail.com", "V005", "Gold");
        Visitor visitor2 = new Visitor("Frank", 22, "frank@gmail.com", "V006", "Silver");
        Visitor visitor3 = new Visitor("Eve", 40, "grace@gmail.com", "V007", "Gold");
        Employee rideOperator = new Employee("John",35, "John@gmail.com","1","Ride Operator");
        ride.setRideOperator(rideOperator); // Assign the ride operator

        ride.AddVisitorToQueue(visitor1);
        ride.AddVisitorToQueue(visitor2);
        ride.AddVisitorToQueue(visitor3);

        for (int i = 4; i <= 13; i++) {
            Visitor visitor = new Visitor("Visitor " + i, 20 + i, "visitor" + i + "@gmail.com", "V00" + i, "Gold");
            ride.AddVisitorToQueue(visitor);
        }

        // Print all Visitors in the queue
        System.out.println("Visitors in the queue:");
        ride.PrintQueue();

        // Run one cycle
        ride.RunOneCycle();

        // Print all Visitors in the queue after one cycle is run
        System.out.println("Visitors in the queue after one cycle:");
        ride.PrintQueue();

        // Print all Visitors in the collection
        System.out.println("Visitors in the ride history:");
        for (Visitor visitor : ride.getRideHistory()) {
            System.out.println(visitor.getName());
        }

        // Sort the collection
        ride.SortRideHistory();
        System.out.println("Ride history after sorting:");
        for (Visitor visitor : ride.getRideHistory()) {
            System.out.println(visitor.getName());
        }
        System.out.println("------------------------");
    }
}










