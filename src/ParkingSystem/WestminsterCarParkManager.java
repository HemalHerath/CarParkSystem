package ParkingSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class WestminsterCarParkManager implements CarParkManager ,Serializable{
	
	Scanner input = new Scanner(System.in);
	Vehicle car=new Car();
	Vehicle []information=car.vehicleInfo;
	
		private String ID;
		private String BRAND;
		private String TYPE;
		private int YEAR;
		private int MONTH;
		private int DAY;
		private int HOUR;
		private int MIN;
		
		public static int slot_no;//variable for get slot number
	
	public void Menu(){//display menu
	
	System.out.println("\n##WELCOME TO WESTMINISTER CAR PARK MANAGER SYSTEM##");
	
	WestminsterCarParkManager A=new WestminsterCarParkManager();
	
	char choice='W';
	while(choice!='Q'){
	
	System.out.println("\n\t MAIN MENU\n");
	System.out.println("\tV : VIEW ALL SLOTS");//System menu
	System.out.println("\tA : ADD CUSTOMER TO A SLOT");
	System.out.println("\tD : SLOT DETAILS");
	System.out.println("\tR : DELETE CUSTOMER");
	System.out.println("\tS : SEARCH VEHICLE BY DATE");
	System.out.println("\tX : SAVE TO THE FILE");
	System.out.println("\tY : READ FROM THE FILE");

	
	System.out.println("\tQ : QUIT FROM THE SYSTEM\n");
	
	System.out.print("Choose a Letter To Continue :");
	choice=input.next().toUpperCase().charAt(0);
	
	while(choice!='A' && choice!='V' && choice!='D' && choice!='Q' && choice!='R' && choice!='S' && choice!='X' 
			&& choice!='Y'){//input validation
		
		System.out.println("INVALID INPUT");
		System.out.print("Choose a Letter To Continue :");
		choice=input.next().toUpperCase().charAt(0);

	}
	switch(choice){
	
		case('V'):{
		A.View();
			};break;
	
		case('A'):{
		A.Add();
			};break;
			
		case('D'):{
		A.Details();
			};break;
			
		case('R'):{
		A.Delete();
			};break;
			
		case('S'):{
		A.Search();
			};break;
			
		case('X'):{
		A.SaveFile();
			};break;
				
		case('Y'):{
		A.ReadFile();
			};break;
				
	}

	}System.out.println("\nTHANK YOU FOR USING WESTMINISTER CAR PARK MANAGER SYSTEM");
	}
	
	public void Add(){//adding customer to the car park
		
		try{
		
		System.out.print("Enetr a SLOT : ");
		slot_no=input.nextInt();
					
		while(slot_no<0 || slot_no >19){
			System.out.println("Invalid Input\n");
			System.out.print("Enter a VALID SLOT :");
			slot_no=input.nextInt();
		}
		
		}catch(Exception e){
			System.out.println("INVALID INPUT\n");
			WestminsterCarParkManager slotValidate = new WestminsterCarParkManager();
			slotValidate.Add();
		}
		
		char choice='A';
		while(choice!='Q'){
		
		System.out.println("\n\tVEHICLE TYPE\n");
		System.out.println("\tC : CAR");//System menu
		System.out.println("\tV : VAN");
		System.out.println("\tM : MOTORBIKE");
		
		System.out.print("\nChoose a Letter To Continue :");
		choice=input.next().toUpperCase().charAt(0);
		
		while(choice!='C' && choice!='V' && choice!='M'){//input validation
			
			System.out.println("INVALID INPUT");
			System.out.println("\nChoose a Letter To Continue : ");
			choice=input.next().toUpperCase().charAt(0);

		}
		switch(choice){
		
			case('C'):{
				
				TYPE="CAR";
				
				System.out.print("Enter the ID PLATE     : ");
				ID = input.next();
				System.out.print("Enter the BRAND        : ");
				BRAND = input.next();
				
				System.out.println("Enter ENTRY TIME and DATE below");
				
				try{
				
				System.out.print("YEAR    :" );
				YEAR = input.nextInt();
				while(YEAR<0 || YEAR >2016){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID YEAR :");
					YEAR=input.nextInt();
				}
				
				System.out.print("MONTH   :" );
				MONTH = input.nextInt();
				while(MONTH<0 || MONTH >12){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID MMONTH :");
					MONTH=input.nextInt();
				}
				
				System.out.print("DAY     :" );
				DAY = input.nextInt();
				while(DAY<0 || DAY >31){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID DAY :");
					DAY=input.nextInt();
				}
				
				System.out.print("HOUR    :" );
				HOUR = input.nextInt();
				while(HOUR<0 || HOUR >23){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID HOUR :");
					HOUR=input.nextInt();
				}
				
				System.out.print("MIN     :" );
				MIN = input.nextInt();
				while(MIN<0 || MIN >59){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID MIN :");
					MIN=input.nextInt();
				}
				
				information[slot_no]=new Car(ID ,BRAND ,"CAR",YEAR,MONTH,DAY,HOUR,MIN);
				
				information[slot_no].Info();
				WestminsterCarParkManager w=new WestminsterCarParkManager();
				w.Menu();
				}catch(Exception e){
					System.out.println("INVALID INPUT\n");
					WestminsterCarParkManager timeValidate = new WestminsterCarParkManager();
					timeValidate.Add();
				}
				};break;
				
			case('V'):{
				
				TYPE="VAN";
				
				System.out.print("Enter the ID PLATE     : ");
				ID = input.next();
				System.out.print("Enter the BRAND        : ");
				BRAND = input.next();
				System.out.println("Enter ENTRY TIME and DATE below");
				
				System.out.print("YEAR    :" );
				YEAR = input.nextInt();
				while(YEAR<0 || YEAR >2016){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID YEAR :");
					YEAR=input.nextInt();
				}
				
				System.out.print("MONTH   :" );
				MONTH = input.nextInt();
				while(MONTH<0 || MONTH >12){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID MMONTH :");
					MONTH=input.nextInt();
				}
				
				System.out.print("DAY     :" );
				DAY = input.nextInt();
				while(DAY<0 || DAY >31){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID DAY :");
					DAY=input.nextInt();
				}
				
				System.out.print("HOUR    :" );
				HOUR = input.nextInt();
				while(HOUR<0 || HOUR >23){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID HOUR :");
					HOUR=input.nextInt();
				}
				
				System.out.print("MIN     :" );
				MIN = input.nextInt();
				while(MIN<0 || MIN >59){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID MIN :");
					MIN=input.nextInt();
				}
				
				information[slot_no]=new Van(ID ,BRAND ,"VAN",YEAR,MONTH,DAY,HOUR,MIN);
				
				information[slot_no].Info();
				WestminsterCarParkManager w=new WestminsterCarParkManager();
				w.Menu();
				};break;
				
			case('M'):{
				
				TYPE="MOTOR BIKE";
				
				System.out.print("Enter the ID PLATE     : ");
				ID = input.next();
				System.out.print("Enter the BRAND        : ");
				BRAND = input.next();
				System.out.println("Enter ENTRY TIME and DATE below");
				
				System.out.print("YEAR    :" );
				YEAR = input.nextInt();
				while(YEAR<0 || YEAR >2016){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID YEAR :");
					YEAR=input.nextInt();
				}
				
				System.out.print("MONTH   :" );
				MONTH = input.nextInt();
				while(MONTH<0 || MONTH >12){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID MMONTH :");
					MONTH=input.nextInt();
				}
				
				System.out.print("DAY     :" );
				DAY = input.nextInt();
				while(DAY<0 || DAY >31){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID DAY :");
					DAY=input.nextInt();
				}
				
				System.out.print("HOUR    :" );
				HOUR = input.nextInt();
				while(HOUR<0 || HOUR >23){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID HOUR :");
					HOUR=input.nextInt();
				}
				
				System.out.print("MIN     :" );
				MIN = input.nextInt();
				while(MIN<0 || MIN >59){
					System.out.println("Invalid Input\n");
					System.out.print("Enter a VALID MIN :");
					MIN=input.nextInt();
				}
				
				information[slot_no]=new Motorbike(ID ,BRAND ,"MOTOR BIKE",YEAR,MONTH,DAY,HOUR,MIN);
				
				information[slot_no].Info();
				WestminsterCarParkManager w=new WestminsterCarParkManager();
				w.Menu();
				};break;
		}
		}
		
	}	
	
	public void View(){//view empty slots
		
		for(int a=0; a<20; a++){
			
			if(information[a]==null){
				System.out.println("\tSlot "+a+" Is NOT USED");
			}else{
				System.out.println("\tSlot "+a+" Is USED");

			}
		}
	}
	
	public void Details(){//view details about parked vehicles
		
		double C_no=0;
		double V_no=0;
		double M_no=0;
		
		DateTime t=new DateTime();
		
		System.out.println("\n\tVEHICLES IN THE CAR PARK\n");
		
		for(int i=0; i<20; i++){
			if(information[i]!=null){
				
				ID=information[i].setID();
				TYPE=information[i].setTYPE();
				
				if(information[i].setTYPE().equals("CAR")){
					TYPE="CAR";
					C_no++;
				}else if(information[i].setTYPE().equals("VAN")){
					TYPE="VAN";
					V_no++;
				}else{ 
					TYPE="MOTORBIKE";
					M_no++;
				}
				YEAR=information[i].setYear();
				MONTH=information[i].setMonth();
				DAY=information[i].setDay();
				HOUR=information[i].setHour();
				MIN=information[i].setMin();
				
				System.out.println("VEHICLE TYPE      : "+TYPE);
				System.out.println("ID PLATE DETAILS  : "+ID);
				System.out.println("DATE AND TIME     : "+YEAR+"/"+MONTH+"/"+DAY+"-"+HOUR+":"+MIN+"\n");
			}
		}
		
		double Cpercent=(C_no/20)*100;
		double Vpercent=(V_no/20)*100;
		double Mpercent=(M_no/20)*100;
		
		String Last_park=car.V;
		
		System.out.println("\nLAST PARK VEHICLE : "+Last_park+"\n");
		
		System.out.println("\tVEHICLE PERCENTAGE IN THE CAR PARK\n");
		System.out.println("CARS        : "+Cpercent+"%");
		System.out.println("VANS        : "+Vpercent+"%");
		System.out.println("MOTOR BIKES : "+Mpercent+"%");
		
		}
	
	public void Delete(){//removing a customer from the car park
		
		System.out.print("ENTER THE ID PLATE : ");
		String idplate=input.next();
		
		int a=0;
		
		for(int j=0; j<20;j++){
				if(information[j]!=null){
					TYPE=information[j].setTYPE();
					
					if(information[j].setID().equalsIgnoreCase(idplate)){
						DateTime cost = new DateTime();
						cost.LeaveTime(j);//calling leave method to get leave time and cost
						a=1;
					}
				}
			
		}if(a==0){
			System.out.println("THERE IS NO VEHICLE IN THAT ID PLATE");
		}
	}
	
	public void Search(){
		
		System.out.println("\nEnter DATE below\n");
		
		try{
			
		System.out.print("  YEAR  :");
		YEAR=input.nextInt();
		while(YEAR<0 || YEAR >2106){
			System.out.println("Invalid Input\n");
			System.out.print("Enter a VALID YEAR :");
			YEAR=input.nextInt();
		}
		
		System.out.print("  MONTH :");
		MONTH=input.nextInt();
		while(MONTH<0 || MONTH >12){
			System.out.println("Invalid Input\n");
			System.out.print("Enter a VALID MONTH :");
			MONTH=input.nextInt();
		}
		
		System.out.print("  DAY   :");
		DAY=input.nextInt();
		while(DAY<0 || DAY >31){
			System.out.println("Invalid Input\n");
			System.out.print("Enter a VALID DAY :");
			DAY=input.nextInt();
		}
		}catch(Exception e){
			System.out.println("INVALID INPUT\n");
			WestminsterCarParkManager dateValidate = new WestminsterCarParkManager();
			dateValidate.Search();
		}
		
		int status=0;
		
		for(int a=0;a<information.length;a++){
			if(information[a]!=null){
				
				
				if(information[a].setYear()==YEAR && information[a].setMonth()==MONTH && information[a].setDay()==DAY){
					ID = information[a].setID();
					BRAND = information[a].setBRAND();
					TYPE = information[a].setTYPE();
					
					System.out.println();
					System.out.println("\tType  :"+TYPE);
					System.out.println("\tID    :"+ID);
					System.out.println("\tBrand :"+BRAND);
					
					status=1;
				}	
			}		
		}
		
		if(status==0)
			System.out.println("NO VEHICLES WERE PARKED");
	
	}

	
	
	public void SaveFile(){
		
		for(int i=0;i<information.length;i++)
			System.out.println(information[i]);
		
			File file=new File("vehicleInformation.txt");
			try {
				FileOutputStream fo=new FileOutputStream(file);
				ObjectOutputStream oo=new ObjectOutputStream(fo);
				
				oo.writeObject(information);
				oo.close();
				fo.close();
			} catch (FileNotFoundException e) {
				
	        System.out.println("File not found");	
	        } catch (IOException e) {
				
			}
		
	}
	
	
	public void ReadFile(){
		
		File file=new File("input.txt");
		
		try {
			FileInputStream fi=new FileInputStream(file);
			ObjectInputStream oi=new ObjectInputStream(fi);
			information=(Vehicle[])oi.readObject();
			
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

         } catch (IOException e) {
				e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		for(int i=0;i<20;i++)
		System.out.println(information[i]);
		
	}
	
	
	
}
