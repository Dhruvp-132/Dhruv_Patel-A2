public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
    }

    public void partThree() {
        Ride ride = new Ride("Roller Coaster", 5);
        Visitor visitor1 = new Visitor("Jack", 25, "jack@example.com", "M001", "Roller Coaster");
        Visitor visitor2 = new Visitor("Sharon", 30, "sharon@example.com", "M002", "Roller Coaster");
        Visitor visitor3 = new Visitor("Benny", 28, "benny@example.com", "M003", "Roller Coaster");
        Visitor visitor4 = new Visitor("Leo", 22, "leo@example.com", "M004", "Roller Coaster");
        Visitor visitor5 = new Visitor("Tom", 26, "tom@example.com", "M005", "Roller Coaster");

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
            Visitor visitor1 = new Visitor("Charlie", 20, "charlie@example.com", "V003", "Gold");
            Visitor visitor2 = new Visitor("Daisy", 35, "daisy@example.com", "V004", "Silver");
            Visitor visitor3 = new Visitor("Emma", 25, "emma@example.com", "V005", "Gold");
            Visitor visitor4 = new Visitor("Frank", 22, "frank@example.com", "V006", "Silver");
            Visitor visitor5 = new Visitor("George", 28, "george@example.com", "V007", "Gold");

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
            System.out.println("------------------------");
        }
    }








