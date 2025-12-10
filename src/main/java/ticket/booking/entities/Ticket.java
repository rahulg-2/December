package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Date;

public class Ticket {

    private String ticketId;

    private String userId;

    private String source;

    private String destination;

    private Date dateofTravel;

    private Train train;

    public Ticket(String ticketId, String userId, String source, String destination, Date dateofTravel, Train train) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.source = source;
        this.destination = destination;
        this.dateofTravel = dateofTravel;
        this.train = train;
    }

    public Ticket(){}

    //to get ticket info
    public String getTicketInfo(){
        return String.format("Ticket ID:%s belongs to User %s from %s to %s on %s",ticketId,userId,source,destination,dateofTravel);
    }


    //getters and setters
    public String getTicketId() {
        return ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDateofTravel() {
        return dateofTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateofTravel(Date dateofTravel) {
        this.dateofTravel = dateofTravel;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
