package bcccp.tickets.season;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jaju on 9/19/17.
 */


class SeasonTicketDAOTest {

    @Test
    void SeasonTicketDAO(){
        //Creating Object
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };

    }
}