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
<<<<<<< HEAD
	
	//TDO Implement constructor
        String carparkId=1;
		int ticketNo=12345;
		String barcode='abc1234';
=======
		//TDO Implement constructor
		String carparkId;
		int ticketNo =1235;
		String barcode;
>>>>>>> 2b66522e9679fc370d8f9a22f931080c1ac07677
	}


	@Override
	public int getTicketNo() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getCarparkId() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void enter(long dateTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getEntryDateTime() {
		// TODO Auto-generated method stub
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
		
	}


	@Override
	public long getPaidDateTime() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isPaid() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public float getCharge() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void exit(long dateTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getExitDateTime() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean hasExited() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
