package Utilities;

public class Car {
	private int cap,location,revenue;
	private int[] passengerLocation;
	private int carTime;
	
	public Car()
	{
		passengerLocation=new int[5];
		cap=5;
	}
	
	
	public int getCarTime() {
		return carTime;
	}

	public void setCarTime(int time) {
		this.carTime = time;
	}

	public void setCap(int cap) {
		this.cap=cap;
	}
	
	public void setlocation(int cap) {
		this.location=location;
	}
	
	public void setRevenue(int revenue) {
		this.revenue=revenue;
	}
	
	public void setPassengerLocation(int[] passengerLocation) {
		this.passengerLocation=passengerLocation;
	}
	
	
	
	public int getCap() {
		return cap;
	}
	
	public int getlocation() {
		return location;
	}
	
	public int getRevenue() {
		return revenue;
	}
	
	public int[] getPassengerLocation() {
		return passengerLocation;
	}
	public void passengerLocationReset() {
		for(int i=0;i<5;i++) {
			passengerLocation[i]=0;
	
		}
	}


}
