package bcccp.tickets.adhoc;

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
		this.carparkId_ = carparkId;
		this.ticketNo_ = ticketNo;
		this.barcode = barcode;
		this.state_ = STATE.ISSUED;		

   
	
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
		return barcode;
		// TODO Auto-generated method stub
		this.barcode=barcode;
		return null;
	}


	
	@Override
	public String getCarparkId() {
		return carparkId_;
		// TODO Auto-generated method stub
		this.carparkIdid=id;
		return null;
	}

	
	
	@Override
	public int getTicketNo() {
		return ticketNo_;
	}
	

	
	@Override
	public void enter(long entryDateTime) {
		this.entryDateTime = entryDateTime;
		this.state_ = STATE.CURRENT;		
	}
	
	
	
	@Override
	public long getEntryDateTime() {
		return entryDateTime;
	}

	
	
	@Override
	public void pay(long paidDateTime, float charge) {
		this.paidDateTime = paidDateTime;
		this.charge = charge;
		state_ = STATE.PAID;
	public boolean isCurrent() {
		
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	@Override
	public long getPaidDateTime() {
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
	public boolean isCurrent() {
		return state_ == STATE.CURRENT;
  }
	
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
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isPaid() {
		return state_ == STATE.PAID;
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
		exitDateTime = dateTime;
		state_ = STATE.EXITED;
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
         private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


        Date date = new Date();
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

       /* LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

		// TODO Auto-generated method stub */
		// TODO Auto-generated method stub */
		
	}



	@Override
	public long getExitDateTime() {
		return exitDateTime;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean hasExited() {
		return state_ == STATE.EXITED;
		// TODO Auto-generated method stub
		if()
		return false;

	}


}
