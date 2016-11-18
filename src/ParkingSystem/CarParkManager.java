package ParkingSystem;

interface CarParkManager {
	
	Vehicle car=new Car();
	String [] VehType=car.Veh;
	String [] ID_Plate=car.Id;
	
	void Add();
	void Delete();
	void Search();
	void Menu();
	void Details();
	
	Vehicle [] information = car.vehicleInfo;
	
}
