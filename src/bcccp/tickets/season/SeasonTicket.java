package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
							 
							 // Class Constructor variables declarication
		//TDO Implement constructor
		//Initializing the class variables
		this.ticketId = "11111"; // 11111 is the default ticket id at the start of the system.
		this.carparkId = "22222"; // 22222 is the defaul carpar id at the start of the system.
		this.startValidPeriod = -1; //-1 is the default valid period
        this.endValidPeriod = -1; // -1 is the default valid period
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCarparkId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getStartValidPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getEndValidPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean inUse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recordUsage(IUsageRecord record) {
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
