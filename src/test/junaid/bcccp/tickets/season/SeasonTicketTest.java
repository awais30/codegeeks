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
    }
}