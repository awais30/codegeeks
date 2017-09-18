package bcccp.tickets.season;

import org.junit.jupiter.api.Test;

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

    }
}