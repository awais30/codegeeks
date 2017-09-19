package bcccp.tickets.season;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jaju on 9/19/17.
 */
class UsageRecordTest {

    @Test
    void finalise(){
        //Creating object
        UsageRecord usageRecord = new UsageRecord("NobalPark1111", 1111);
        //Creating time as long variable
        long time = 0;
        //Using assertEqual method to check if the return value is good or not
        assertEquals(time, usageRecord.getEndTime());
    }

    @Test
    void getStartTime(){
        //Creating object
        UsageRecord usageRecord = new UsageRecord("NobalPark1111", 1111);
        //Creating time as long variable
        long time = 1111;
        //Using assertEqual method to check if the return value is good or not
        assertEquals(time, usageRecord.getStartTime());
    }

    @Test
    void getEndTime(){
        //Creating object
        UsageRecord usageRecord = new UsageRecord("NobalPark1111", 1111);
        //Creating time as long variable
        long time = 0;
        //Using assertEqual method to check if the return value is good or not
        assertEquals(time, usageRecord.getEndTime());
    }

    @Test
    void getSeasonTicketId(){
        //Creating object
    }
}