package bcccp.tickets.season;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jaju on 9/18/17.
 */
class SeasonTicketTest {

    @Test
    void getId() {
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        String id = seasonTicket.getId();
        assertEquals("S11111", id);
    }

    @Test
    void getCarparkId(){
        //Creating Object
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        //Creating id as string variable
        String id = seasonTicket.getCarparkId();
        //Using assertEqual method to check if the return value is good or not
        assertEquals("NobalPark111", id);
    }

    @Test
    void getStartValidPeriod(){
        //Creating Object
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        //Creating start as long variable
        long start = seasonTicket.getStartValidPeriod();
        //Using assertEqual method to check if the return value is good or not
        assertEquals("1111", start);
    }

    @Test
    void getEndValidPeriod(){
        //Creating Object
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        //Creating start as long variable
        long end = seasonTicket.getEndValidPeriod();
        // Using  assertEqual method to check if the return value is good or not
        assertEquals(2222, end);
    }

    @Test
    void inUse(){
        //Creating Object
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        //Creating inUse as long variable
        boolean inUse = seasonTicket.inUse();
        // Using  assertEqual method to check if the return value is good or not
        assertEquals(false, inUse);

    }


    @Test
    void recordUsage(){
        //Creating Object
        IUsageRecord record = null;
        //creating object of the season ticket
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        Assertions.assertThrows(RuntimeException.class, () -> {
            seasonTicket.recordUsage(record);
        });
    }

    @Test
    void getCurrentUsageRecord(){
        //Creating Object
        IUsageRecord record = null;
        //creating object of the season ticket
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        assertEquals(record, seasonTicket.getCurrentUsageRecord());
    }

    @Test
    void endUsage(){
        //Creating Object
        IUsageRecord record = null;
        //creating object of the season ticket
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        Assertions.assertThrows(RuntimeException.class, () -> {
            seasonTicket.endUsage(1111);
        });
    }

    @Test
    void getUsageRecords(){
        //Creating Object
        IUsageRecord record = null;
        //creating object of the season ticket
        SeasonTicket seasonTicket = new SeasonTicket("S11111", "NobalPark111", 1111, 2222);
        java.util.List<IUsageRecord> list = new LinkedList<>();
        //assert status
        assertEquals(list,seasonTicket.getUsageRecords());
    }
}












