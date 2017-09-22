package bcccp.tickets.season;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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

        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);

    }

    @Test
    void registerTicket(){
        //Creating Object
        ISeasonTicket iSeasonTicket = new ISeasonTicket() {
            @Override
            public String getId() {
                return null;
            }

            @Override
            public String getCarparkId() {
                return null;
            }

            @Override
            public long getStartValidPeriod() {
                return 0;
            }

            @Override
            public long getEndValidPeriod() {
                return 0;
            }

            @Override
            public boolean inUse() {
                return false;
            }

            @Override
            public void recordUsage(IUsageRecord record) {

            }

            @Override
            public IUsageRecord getCurrentUsageRecord() {
                return null;
            }

            @Override
            public void endUsage(long dateTime) {

            }

            @Override
            public List<IUsageRecord> getUsageRecords() {
                return null;
            }
        };
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        seasonTicketDAO.registerTicket(iSeasonTicket);
    }

    @Test
    void deregisterTicket(){
        // Creating Object
        ISeasonTicket seasonTicket = new ISeasonTicket() {
            @Override
            public String getId() {
                return null;
            }

            @Override
            public String getCarparkId() {
                return null;
            }

            @Override
            public long getStartValidPeriod() {
                return 0;
            }

            @Override
            public long getEndValidPeriod() {
                return 0;
            }

            @Override
            public boolean inUse() {
                return false;
            }

            @Override
            public void recordUsage(IUsageRecord record) {

            }

            @Override
            public IUsageRecord getCurrentUsageRecord() {
                return null;
            }

            @Override
            public void endUsage(long dateTime) {

            }

            @Override
            public List<IUsageRecord> getUsageRecords() {
                return null;
            }
        };

        IUsageRecordFactory factory = new IUsageRecordFactory() {

            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        seasonTicketDAO.deregisterTicket(seasonTicket);
    }

    @Test
    void findTicketById(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        assertEquals(null, iSeasonTicket);
    }

    @Test
    void getNumberOfTickets(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        assertEquals(0,seasonTicketDAO.getNumberOfTickets());
    }

    @Test
    void recordTicketEntry(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        Assertions.assertThrows(RuntimeException.class, () -> {
            seasonTicketDAO.recordTicketEntry("1");
        });
    }

    @Test
    void recordTicketExit(){
        // Creating Object
        ISeasonTicket iSeasonTicket;
        IUsageRecordFactory factory = new IUsageRecordFactory() {
            @Override
            public IUsageRecord make(String ticketId, long startDateTime) {
                return null;
            }
        };
        SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);
        iSeasonTicket = seasonTicketDAO.findTicketById("736366336363");
        Assertions.assertThrows(RuntimeException.class, () -> {
            seasonTicketDAO.recordTicketExit("1"); //
        });
    }
}































