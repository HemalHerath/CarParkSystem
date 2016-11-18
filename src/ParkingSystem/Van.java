package ParkingSystem;

import java.util.Scanner;

public class Van extends Vehicle {
	
	private String VOLUME [] = new String [20];
	
	public Van(){}

	public Van(String iD, String bRAND, String tYPE, int yEAR, int mONTH , int dAY, int hOUR, int mIN) {
		
		ID_Plate=iD;
		Brand=bRAND;
		VehType=tYPE;
		Year=yEAR;
		Month=mONTH;
		Day=dAY;
		Hour=hOUR;
		Min=mIN;
		
	}
	
	Scanner input =new Scanner(System.in);
	
	public void Info() {
		
		V="VAN";
		
		WestminsterCarParkManager WestminsterCarParkManagerObj=new WestminsterCarParkManager();
		DateTime TimeObj = new DateTime();
		
		Slot = WestminsterCarParkManagerObj.slot_no;
		
		try{
		
		System.out.print("Enter the CARGO VOLUME : ");
		VOLUME[Slot] = input.next();
		
		}catch(Exception e){
			System.out.println("INVALID INPUT\n");
			Vehicle volumeValidate = new Van();
			volumeValidate.Info();
		}
		
	}

	public String setID(){
		return ID_Plate;
	}
	public String setBRAND(){
		return Brand;
	}
	public String setTYPE(){
		return VehType;
	}
	public int setYear(){
		return Year;
	}
	public int setMonth(){
		return Month;
	}
	public int setDay(){
		return Day;
	}
	public int setHour(){
		return Hour;
	}
	public int setMin(){
		return Min;
	}
	
}
