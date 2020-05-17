package Helpers.objetcts;

import lombok.Data;

@Data
public class FlightData {

    public Integer flightNumber;
    public String airline;
    public String departTime;
    public String arriveTime;
    public Double price;

}
