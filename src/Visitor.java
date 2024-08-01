public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    public Visitor() {
        super("Unknown", 0, "Unknown");
        this.visitorId = "Unknown";
        this.ticketType = "Unknown";
    }

    public Visitor(String name, int age, String address, String visitorId, String ticketType) {
        super(name, age, address);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getters and setters
    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
