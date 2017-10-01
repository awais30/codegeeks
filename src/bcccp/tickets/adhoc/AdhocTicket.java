package bcccp.tickets.adhoc;

import java.text.DateFormat;
import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId_;
	private int ticketNo_;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;
	private STATE state_;
	
	private enum STATE { ISSUED, CURRENT, PAID, EXITED }

	
	
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

		this.carparkId_ = carparkId;
		this.ticketNo_ = ticketNo;
		this.barcode = barcode;
		this.state_ = STATE.ISSUED;		

	}

	
	
	@Override
	public String getBarcode() {

		// TODO Auto-generated method stub
		this.barcode=barcode;// get barcode value 
		return null;

		return barcode;

	}


	
	@Override
	public String getCarparkId() {

		// TODO Auto-generated method stub
		this.carparkIdid=id;// get catparkid
		return null;

		return carparkId_;

	}

	
	
	@Override

	public void enter(long dateTime) {
		
		Date date = new Date(); //Date class object
        System.out.println(sdf.format(date));
		// TODO Auto-generated method stub
		

	public int getTicketNo() {
		return ticketNo_;

	}
	

	
	@Override

	public long getEntryDateTime() {
		// TODO Auto-generated method stub
		return entryDatetime; // returns date time of system
		return 0;

	public void enter(long entryDateTime) {
		this.entryDateTime = entryDateTime;
		this.state_ = STATE.CURRENT;		

	}
	
	
	
	@Override
	public long getEntryDateTime() {
		return entryDateTime;
	}

	
	
	@Override

	public void pay(long dateTime, float charge) {
		// TODO Auto-generated method stub
		this.dateTime= LocalDateTime.now();//
		this.charge=charge;
		
		

	public void pay(long paidDateTime, float charge) {
		this.paidDateTime = paidDateTime;
		this.charge = charge;
		state_ = STATE.PAID;

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

		return paidDateTime;
	}



	@Override
	public float getCharge() {
		return charge;
	}

	
	
	public String toString() {
		Date entryDate = new Date(entryDateTime);
		Date paidDate = new Date(paidDateTime);
		Date exitDate = new Date(exitDateTime);

		return "Carpark    : " + carparkId_ + "\n" +
		       "Ticket No  : " + ticketNo_ + "\n" +
		       "Entry Time : " + entryDate + "\n" + 
		       "Paid Time  : " + paidDate + "\n" + 
		       "Exit Time  : " + exitDate + "\n" +
		       "State      : " + state_ + "\n" +
		       "Barcode    : " + barcode;		
	}



	@Override

	public void exit(long dateTime) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
         private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

// Creating date object 
        Date date = new Date();
        System.out.println(sdf.format(date)); // show date to user on screen 


	@Override
	public long getExitDateTime() {
		return 0;
	}

	@Override
	public boolean hasExited() {
		return false;
	}

	public boolean isCurrent() {
		return state_ == STATE.CURRENT;
	}




	@Override
	public boolean isPaid() {
		return state_ == STATE.PAID;
	}


       LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));





		// TODO Auto-generated method stub */
		// TODO Auto-generated method stub 
		

	@Override
	public void exit(long dateTime) {
		exitDateTime = dateTime;
		state_ = STATE.EXITED;

	}



	@Override
	public long getExitDateTime() {
		return exitDateTime;
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

		return state_ == STATE.EXITED;

	}


}
