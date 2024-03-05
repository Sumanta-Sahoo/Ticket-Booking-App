package ticket.booking.Entity;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainID;
    private String trainNumber;
    private List<List<Integer>> trainSeats;
    private Map<String, String> trainStationTime;
    private List<String> station;
    public String getTrainID() {
        return trainID;
    }
    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }
    public String getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
    public List<List<Integer>> getTrainSeats() {
        return trainSeats;
    }
    public void setTrainSeats(List<List<Integer>> trainSeats) {
        this.trainSeats = trainSeats;
    }
    public Map<String, String> getTrainStationTime() {
        return trainStationTime;
    }
    public void setTrainStationTime(Map<String, String> trainStationTime) {
        this.trainStationTime = trainStationTime;
    }
    public List<String> getStation() {
        return station;
    }
    public void setStation(List<String> station) {
        this.station = station;
    }
    @Override
    public String toString() {
        return "Train [trainID=" + trainID + ", trainNumber=" + trainNumber + ", trainSeats=" + trainSeats
                + ", trainStationTime=" + trainStationTime + ", station=" + station + "]";
    }


}
