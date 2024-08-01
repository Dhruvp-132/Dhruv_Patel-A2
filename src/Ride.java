public class Ride {
    private String rideName;
    private int capacity;
    private boolean isOpen;
    private Employee operator;

    public Ride() {
        this.rideName = "Roller-Coaster";
        this.capacity = 0;
        this.isOpen = false;
        this.operator = null;
    }

    public Ride(String rideName, int capacity, boolean isOpen, Employee operator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.operator = operator;
    }

    // Getters and setters
    public String getRideName()
    {

        return rideName;
    }

    public void setRideName(String rideName)
    {
        this.rideName = rideName;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public boolean isOpen()
    {
        return isOpen;
    }

    public void setOpen(boolean isOpen)
    {
        this.isOpen = isOpen;
    }

    public Employee getOperator()
    {
        return operator;
    }

    public void setOperator(Employee operator)
    {
        this.operator = operator;
    }

    // Method to assign an Employee to operate the ride
    public void assignOperator(Employee operator) {
        this.operator = operator;
        this.isOpen = true; // Assume the ride is open when an operator is assigned
    }
}