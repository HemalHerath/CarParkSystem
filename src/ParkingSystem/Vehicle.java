package ParkingSystem;

public abstract class Vehicle {
	
	public String Brand;//main variables
	public char Type;
	public String VehType;
	public String ID_Plate;
	public int Slot;
	public int Year;
	public int Month;
	public int Day;
	public int Hour;
	public int Min;
	
	public static String V = null;
	
	public static String[] Veh=new String[20];
	public static String[] Id=new String[20];
	
	public static Vehicle vehicleInfo[]=new Vehicle[20];//object array for get information about vehicles

	public abstract void Info();//abstract method for get information  
	
	public abstract String setID();
	public abstract String setBRAND();
	public abstract String setTYPE();
	public abstract int setYear();
	public abstract int setMonth();
	public abstract int setDay();
	public abstract int setHour();
	public abstract int setMin();
	
}
