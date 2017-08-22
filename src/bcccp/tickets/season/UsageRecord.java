package bcccp.tickets.season;

public class UsageRecord implements IUsageRecord {
	
	String ticketId;
	long startDateTime;
	long endDateTime;
	

	public UsageRecord(){
		ticketId = "11111"; //default value
        startDateTime = -1; //default value
		endDateTime = -1; //default value
	}
	
	public UsageRecord(String ticketId, long startDateTime) {
		this.ticketId = ticketId; //value been set
		this.startDateTime = startDateTime; //value been set..
	}

	@Override
	public void finalise(long endDateTime) {
		this.endDateTime = endDateTime; // endDatTime paremeter value set to the actual class variable of the class
	}

	@Override
	public long getStartTime() {
		return startDateTime;
	}

	@Override
	public long getEndTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSeasonTicketId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
