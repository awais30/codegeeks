package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;// declaring array list name usage
	private IUsageRecord currentUsage = null;//initilize record usage to null
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
							 

		//Initializing the class variables
		this.ticketId = "4444"; // 4444 is the default ticket id at the start of the system.
		this.carparkId = "55555"; // 5555 is the defaul carpar id at the start of the system.
		this.startValidPeriod = null; //null is the default valid period
        this.endValidPeriod = null; // null is the default valid period
	}

	@Override
	public String getId() {
		//returns getId using this command
		this.ticketId=ticketId; // get ticketId
        return ticketId;
	}

	@Override
	public String getCarparkId() {
		//returns getCarparkId using this command
		this.getCarparkId=carparkId; // get carparkId
        return carparkId;
	}

	@Override
	public long getStartValidPeriod() {
		//returns getStartValidPeriod using this command.
		this.getStartValidPeriod=startValidPeriod;
		return startValidPeriod;
	}

	@Override
	public long getEndValidPeriod() {
		//returns getEndValidPeriod using this command
		this.getEndValidPeriod=endValidPeriod;
		return endValidPeriod;
	}

	@Override
	public boolean inUse() {
		// TODO Auto-generated method stub
		if (carparkId== 'True')
		{
			return=='true';
			
		}
		else 
		return false;
	}

	@Override
	public void recordUsage(IUsageRecord record) 
	{
		
	    int record;
		int carparkId;
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endUsage(long dateTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		// TODO Auto-generated method stub
		return null;
	}


}