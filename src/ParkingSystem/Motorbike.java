package ParkingSystem;

import java.util.Scanner;

public class Motorbike extends Vehicle{
		
	private int ENGIN_SIZE [] = new int [20];
		
	public Motorbike(String iD, String bRAND, String tYPE, int yEAR, int mONTH , int dAY, int hOUR, int mIN){
			
		ID_Plate=iD;
		Brand=bRAND;
		VehType=tYPE;
		Year=yEAR;
		Month=mONTH;
		Day=dAY;
		Hour=hOUR;
		Min=mIN;
			
	}
		
	public Motorbike(){}
		
	Scanner input =new Scanner(System.in);
		
	public void Info(){
		
		V="MOTORBIKE";
			
		WestminsterCarParkManager WestminsterCarParkManagerObj=new WestminsterCarParkManager();
		DateTime TimeObj = new DateTime();
		
		Slot = WestminsterCarParkManagerObj.slot_no;
		
		try{
			
		System.out.print("Enter the ENGINE SIZE  : ");
		ENGIN_SIZE[Slot] = input.nextInt();
		
		}catch(Exception e){
			System.out.println("INVALID INPUT\n");
			Vehicle sizeValidate = new Motorbike();
			sizeValidate.Info();
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