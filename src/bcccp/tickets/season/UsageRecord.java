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
		ticketId = ticketId; //value been set
		startDateTime = startDateTime; //value been set
	}



	@Override
	public void finalise(long endDateTime) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public long getStartTime() {
		// TODO Auto-generated method stub
		return 0;
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
