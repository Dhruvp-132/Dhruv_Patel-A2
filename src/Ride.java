import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private int maxRiders;
    private Employee rideOperator;
    private Queue<Visitor> waitingLine = new LinkedList<>();
    private LinkedList<Visitor> rideHistory = new LinkedList<>();
    private int numOfCycles = 0;

    public Ride() {
    }

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
        System.out.println(visitor.getName() + " removed from the queue.");
    }

    @Override
    public void PrintQueue() {
        System.out.println("Current Queue:");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName() + " added to the queue.");
            ;
        }
    }

    @Override
    public void RunOneCycle() {

        if (rideOperator == null) {
            System.out.println("Ride cannot be run. No ride operator assigned.");
            return;
        }

        if (waitingLine.isEmpty()) {
            System.out.println("Ride cannot be run. No visitors in the queue.");
            return;
        }
        System.out.println("Running one cycle of the ride...");
        int ridersCount = Math.min(maxRiders, waitingLine.size());
        for (int i = 0; i < ridersCount; i++) {
            Visitor visitor = waitingLine.poll();
            if (visitor != null) {
                rideHistory.add(visitor);
                System.out.println(visitor.getName() + " enjoyed the ride!");
            }

        }
        numOfCycles++;
        System.out.println("Ride cycle completed. Number of cycles: " + numOfCycles);

    }

    @Override
    public void PrintRideHistory() {
        System.out.println("Ride History:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        if (iterator.hasNext()) {
            do {
                Visitor visitor = iterator.next();
                System.out.println(visitor.getName());
            } while (iterator.hasNext());
        }
    }

    // Part 4A
    public void AddVisitorToRideHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to ride history.");
    }

    public boolean CheckVisitorInRideHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    public int GetNumberOfVisitorsInRideHistory() {
        return rideHistory.size();
    }

    //Part4B
    public void SortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted.");
    }

    // Part 6
    public void writeRideHistoryToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.println(visitor.toString());
            }
            System.out.println("Ride history successfully written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}