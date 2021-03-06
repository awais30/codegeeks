package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	
	public EntryController(){

	}

	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {
		//entry controller
		this.carpark = carpark;
		this.entryGate = entryGate;
		this.outsideSensor = os;
		this.insideSensor = is;
		this.ui = ui;
	}



	@Override
	public void buttonPushed() {
		System.out.println("Button Pushed");
		
	}



	@Override
	public void ticketInserted(String barcode) {
		System.out.println("Ticket inserted.");
		
	}



	@Override
	public void ticketTaken() {

		System.out.println("Ticket taken.");
	}



	@Override
	public void notifyCarparkEvent() {
		System.out.println("Notified Car park event.");
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		System.out.println("Car Event detected");
	}

	
	
}
