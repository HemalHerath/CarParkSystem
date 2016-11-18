package ParkingSystem;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\tLOGIN\n ");//Login to the system
		String name="";
		String password="";
		while(!(name.equals("hemal")) || !(password.equals("118"))){//check user name and password
		System.out.print("  Enter User Name : ");
		name=input.next();
		System.out.print("  Enter password  : ");
		password=input.next();
		if(!(name.equals("hemal")) || !(password.equals("118"))){//if user name and password correct
		System.out.println("LOGIN FAIL");
		}else{
		System.out.println("LOGIN SUCCESS\n");//if user name and password wrong
		}
		}
		
		WestminsterCarParkManager menu = new WestminsterCarParkManager();
		menu.Menu();
		
	}
}		
