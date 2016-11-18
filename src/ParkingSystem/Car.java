package ParkingSystem;

import java.util.Scanner;

public class Car extends Vehicle{
	
	private String COLOR [] = new String [20];//array for save color of the car 
	private int DOORS [] = new int [20];//array for save number of doors in the car
	
	Car(){}
	
	Car(String iD, String bRAND, String tYPE, int yEAR, int mONTH , int dAY, int hOUR, int mIN){
		
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
	
	public void Info(){
		
		V="CAR";
		
		WestminsterCarParkManager WestminsterCarParkManagerObj=new WestminsterCarParkManager();
		DateTime TimeObj=new DateTime();
		
		Slot = WestminsterCarParkManagerObj.slot_no;
		
		try{
		
		System.out.print("Enter the NO OF DOORS  : ");
		DOORS[Slot] = input.nextInt();
		
		}catch(Exception e){
			System.out.println("INVALID INPUT\n");
			Vehicle doorValidate = new Car();
			doorValidate.Info();
		}
		
		System.out.print("Enter the COLOR        : ");
		COLOR[Slot] = input.next();
			
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
