package ticket.booking.Entity;

import java.util.List;

public class User {

    public User(String userId,String userName,String userPassword,String userHashPassword,List<Ticket> ticketsBooked){
        this.userId=userId;
        this.userName=userName;
        this.userPassword=userPassword;
        this.userHashPassword=userHashPassword;
        this.ticketsBooked=ticketsBooked;
    }

    public User(){}

    private String userId;
    private String userName;
    private String userPassword;
    private String userHashPassword;
    private List<Ticket> ticketsBooked;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserHashPassword() {
        return userHashPassword;
    }
    public void setUserHashPassword(String userHashPassword) {
        this.userHashPassword = userHashPassword;
    }
    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }
    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public void printTicket(){
        for(Ticket ticket : ticketsBooked){
            System.out.println(ticket.getTicketInfo());
        }
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
                + ", userHashPassword=" + userHashPassword + ", ticketsBooked=" + ticketsBooked + "]";
    }
}
