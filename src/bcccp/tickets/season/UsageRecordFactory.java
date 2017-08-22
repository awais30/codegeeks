package bcccp.tickets.season;

import java.util.ArrayList;

public class UsageRecordFactory implements IUsageRecordFactory {

	ArrayList<SeasonTicket> ticketArrayList; //to keep the list of all the session tickets been issued

	public UsageRecordFactory(){
		ticketArrayList = new ArrayList<SeasonTicket>();
	}

	@Override
	public IUsageRecord make(String ticketId, long startDateTime) {

		return null;
	}


}
