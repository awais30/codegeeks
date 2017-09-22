package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {

	
	private List<IUsageRecord> usages;// declaring array list name usage
	private IUsageRecord currentUsage = null;//initilize record usage to null
	


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
							 

		//Initializing the class variables
		this.ticketId = "4444"; // 4444 is the default ticket id at the start of the system.
		this.carparkId = "55555"; // 5555 is the defaul carpar id at the start of the system.
		this.startValidPeriod = null; //null is the default valid period
        this.endValidPeriod = null; // null is the default valid period


	public SeasonTicket (String ticketId, String carparkId,
						 long startValidPeriod,
						 long endValidPeriod) {
		this.ticketId = ticketId;
		this.carparkId =carparkId;
		this.startValidPeriod = startValidPeriod;
		this.endValidPeriod = endValidPeriod;

		usages = new ArrayList<IUsageRecord>();

	}


	@Override
	public String getId() {

		//returns getId using this command
		this.ticketId=ticketId; // get ticketId
        return ticketId;

		return ticketId;

	}


	@Override
	public String getCarparkId() {

		//returns getCarparkId using this command
		this.getCarparkId=carparkId; // get carparkId
        return carparkId;

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

		return currentUsage != null;

	}


	@Override

	public void recordUsage(IUsageRecord record) 
	{
		
	    int record;
		int carparkId;
		IUsageRecord record=new IUsageRecord<>;
		
		
		// TODO Auto-generated method stub
		

	public void recordUsage(IUsageRecord record) {
		if(record == null){
			throw new RuntimeException("Record is not been initalized");
		}
		currentUsage = record;
		if (!usages.contains(record) ) {
			usages.add(record);
		}


	}


	@Override
	public IUsageRecord getCurrentUsageRecord() {
		return currentUsage;
	}


	@Override

	public void endUsage(long dateTime) {
		// TODO Auto-generated method stub
  // Instantiate a Date object
      Date date = new Date(); // date class object

      // display time and date using toString()
      System.out.println(date.toString());
	  
	  
   }		

	public List<IUsageRecord> getUsageRecords() {
		return Collections.unmodifiableList(usages);

	}


	@Override

	public List<IUsageRecord> getUsageRecords() {
		
		
		// TODO Auto-generated method stub
		return null;

	public void endUsage(long dateTime) {
		if (currentUsage == null) throw new RuntimeException("SeasonTicket.endUsage : ticket is not in use");

		currentUsage.finalise(dateTime);
		currentUsage = null;

	}



	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carpark    : " + carparkId + "\n" +
				"Ticket No  : " + ticketId + "\n" );
		for (IUsageRecord usage : usages) {
			builder.append(usage.toString() + "\n");
		}
		return builder.toString();

	}


}