package Controllers;


import java.util.ArrayList;

import BoundaryDB.*;
import Entitity.*;

public class SeatController{
    
    private SeatsDB db;

    public SeatController(){
       db = new SeatsDB();
    }

    public ArrayList<Seat> getSeatPageInformation(int id){
        return db.getSeatsFromShowtime(id);
    }

    public boolean forwardRuserCheck(ArrayList<Seat>seats,User u){
        return db.checkRuserSeatLimit(seats,u);
    }

    public boolean bookSeat(ArrayList<Seat>seats,User u){
        return db.checkRuserSeatLimit(seats,u);
    }
}
