package bcccp.tickets.season;

import java.util.ArrayList;

public class UsageRecordFactory implements IUsageRecordFactory {

	ArrayList<SeasonTicket> ticketArrayList; //to keep the list of all the session tickets been issued

	public UsageRecordFactory(){
		this.ticketArrayList = new ArrayList<SeasonTicket>(); // arraylist been initalized
	}

	@Override
	public IUsageRecord make(String ticketId, long startDateTime) {

		// new SeasonTicket object been created
		SeasonTicket seasonTicket = new SeasonTicket(ticketId, "22222", startDateTime, 10);
		ticketArrayList.add(seasonTicket);
		return null;
	}


}
