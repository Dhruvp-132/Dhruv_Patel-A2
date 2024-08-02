// Ride.java
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private int maxRiders;
    private Employee rideOperator;
    private Queue<Visitor> waitingLine = new LinkedList<>();
    private LinkedList<Visitor> rideHistory = new LinkedList<>();

    public Ride() {}

    public Ride(String rideName, int maxRiders) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    // RideManagement Methods
    @Override
    public void AddVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
    }

    @Override
    public void RemoveVisitorFromQueue(Visitor visitor) {
        waitingLine.remove(visitor);
    }

    @Override
    public void PrintQueue() {
        System.out.println("Current Queue:");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void RunOneCycle() {
        System.out.println("Running one cycle of the ride...");
        int ridersCount = Math.min(maxRiders, waitingLine.size());
        for (int i = 0; i < ridersCount; i++) {
            Visitor visitor = waitingLine.poll();
            if (visitor != null) {
                rideHistory.add(visitor);
                System.out.println(visitor.getName() + " enjoyed the ride!");
            }
        }
    }

    @Override
    public void PrintRideHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }
}
