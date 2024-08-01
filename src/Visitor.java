// Visitor.java
public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    public Visitor() {}

    public Visitor(String name, int age, String email, String visitorId, String membershipStatus) {
        super(name, age, email);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getters and Setters
    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setMembershipStatus(String ticketType) {
        this.ticketType = ticketType;
    }
}
