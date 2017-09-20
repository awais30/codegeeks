package bcccp.tickets.season;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jaju on 9/20/17.
 */
class UsageRecordFactoryTest {

    @Test
    void make(){
        //Creating Object
        SeasonTicket seasonTicket = new SeasonTicket("TIC111", "NobalPark111", 1111, 2222);
        UsageRecordFactory usageRecordFactory = new UsageRecordFactory();
        usageRecordFactory.make(seasonTicket.getId(), seasonTicket.getStartValidPeriod());
        assertEquals(new IUsageRecord() {
            @Override
            public void finalise(long endDateTime) {

            }

            @Override
            public long getStartTime() {
                return 0;
            }

            @Override
            public long getEndTime() {
                return 0;
            }

            @Override
            public String getSeasonTicketId() {
                return null;
            }
        }, usageRecordFactory.make(seasonTicket.getId(), seasonTicket.getStartValidPeriod()));
    }
}