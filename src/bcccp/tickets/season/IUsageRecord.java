package bcccp.tickets.season;

public interface IUsageRecord {
	//this is test comment
	public void finalise(long endDateTime);
	public long getStartTime();
	public long getEndTime();
	public String getSeasonTicketId();

}
