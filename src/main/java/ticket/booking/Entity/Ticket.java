package ticket.booking.Entity;

import java.util.Date;

public class Ticket {
    private String ticketID;
    private String userID;
    private String ticketSource;
    private String ticketDestination;
    private Date ticketDateOfTravel;
    private Train train;
    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getTicketSource() {
        return ticketSource;
    }
    public void setTicketSource(String ticketSource) {
        this.ticketSource = ticketSource;
    }
    public String getTicketDestination() {
        return ticketDestination;
    }
    public void setTicketDestination(String ticketDestination) {
        this.ticketDestination = ticketDestination;
    }
    public Date getTicketDateOfTravel() {
        return ticketDateOfTravel;
    }
    public void setTicketDateOfTravel(Date ticketDateOfTravel) {
        this.ticketDateOfTravel = ticketDateOfTravel;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }

    public String getTicketInfo(){
        return String.format("Ticket ID : %s belongs to User %s from %s to %s",ticketID,userID,ticketSource,ticketDestination);
    }

    @Override
    public String toString() {
        return "Ticket [ticketID=" + ticketID + ", userID=" + userID + ", ticketSource=" + ticketSource
                + ", ticketDestination=" + ticketDestination + ", ticketDateOfTravel=" + ticketDateOfTravel + ", train="
                + train + "]";
    }

}
