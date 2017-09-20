package bcccp.tickets.adhoc;

import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;

	
	
	public AdhocTicket(String carparkId, int ticketNo, String barcode) {


	
	//TDO Implement constructor
        String carparkId=1;
		int ticketNo=12345;
		String barcode='abc1234';




	}


	@Override
	public int getTicketNo() {
		// TODO Auto-generated method stub
		this.ticketNo=ticketNo;
		
		return 0;
	}


	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		this.barcode=barcode;
		return null;
	}


	@Override
	public String getCarparkId() {
		// TODO Auto-generated method stub
		this.carparkIdid=id;// get catparkid
		return null;
	}


	@Override
	public void enter(long dateTime) {
		
		Date date = new Date(); //Date class object
        System.out.println(sdf.format(date));
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getEntryDateTime() {
		// TODO Auto-generated method stub
		return entryDatetime; // returns date time of system
		return 0;
	}


	@Override
	public boolean isCurrent() {
		
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void pay(long dateTime, float charge) {
		// TODO Auto-generated method stub
		this.dateTime= LocalDateTime.now();//
		this.charge=charge;
		
		
	}


	@Override
	public long getPaidDateTime() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 Date date = new Date();
		 System.out.println(sdf.format(date));
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isPaid() {
		
		if(isPaid='true')
		{ // success message to user 
			System.out.println("Ticket Paid Successfully");
			
		}
		else 
		{
			//output message to user 
			Syestem.out.println("Payment not proceed successfully");
		}
		// TODO Auto-generated method stub//
		return false;
	}


	@Override
	public float getCharge() {
		// TODO Auto-generated method stub
		float ticket = (float) 12.4;
		float calcTicket=ticket;
		if (paidticket<calcTicket);
		
		{
			
			System.out.pritnln("Please paid Full amount // See Controler Room");
			
			
		}
		
		else 
		{
			System.out.println("Thanks for using Prking .See you next time");
			
		}
		return 0;
	}


	@Override
	public void exit(long dateTime) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
         private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

// Creating date object 
        Date date = new Date();
        System.out.println(sdf.format(date)); // show date to user on screen 
		

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

       LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

		// TODO Auto-generated method stub */
		// TODO Auto-generated method stub 
		
	}


	@Override
	public long getExitDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean hasExited() {
		// TODO Auto-generated method stub
		if(pay=='true')
		{
			System.out.println("Exit successfully");
			
		}
		
		else
		
		return false;
	}

	
	
}
