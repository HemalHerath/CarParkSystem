package ParkingSystem;

import java.util.Scanner;

public class DateTime {
	
	private static final int[] E_MIN = null;
	public static int E_MINUTE [] = new int [20];
	public static int E_HOUR [] = new int [20];
	public static int E_MONTH [] = new int [20];
	public static int E_DAY [] = new int [20];
	public static int L_MINUTE [] = new int [20];
	public static int L_HOUR [] = new int [20];
	public static int L_DAY [] = new int [20];
	public static int L_MONTH [] = new int [20];
	
	public static int slot;
	
	Vehicle obj=new Car();
	Vehicle []timeInfo=obj.vehicleInfo;
	
	int E_month;
	int E_day;
	int E_hour;
	int E_min;
	int L_month;
	int L_day;
	int L_hour;
	int L_min;
	int D_month;
	int D_day;
	int D_min;
	int D_hour;
	
	Scanner input = new Scanner(System.in);
	
	public void EntryTime(int index){
		
		E_MONTH[index]=timeInfo[index].Month;
		E_DAY[index]=timeInfo[index].Day;
		E_HOUR[index]=timeInfo[index].Hour;
		E_MIN[index]=timeInfo[index].Min;
		
	}
	
	public void LeaveTime(int No){
	
		DateTime info = new DateTime();
		System.out.println("Enter the LEAVING DATE and TIME below");
		
		slot=No;
		
		System.out.print("MONTH  : ");
		L_MONTH[slot]=input.nextInt();
		System.out.print("DAY    : ");
		L_DAY[slot]=input.nextInt();
		System.out.print("HOUR   : ");
		L_HOUR[slot]=input.nextInt();
		System.out.print("MINUTE : ");
		L_MINUTE[slot]=input.nextInt();
		
		info.TimeDifference(slot);
		
	}
		
	public void TimeDifference(int no){
				
		if(L_day>=E_day){
			D_day=L_day-E_day;
		}else{
		D_day=(30+L_day)-E_day;
		}
		
		if(L_month>=E_month){
			if(L_day<E_day){
				D_month=(L_month - 1)-E_month;
				
			}else{
				D_month=L_month - E_month;
			}
		}else{
			if(L_day<E_day){
				D_month=(12+(L_month-1))-E_month;
			}else{
				D_month=(12+L_month)-E_month;
			}
		}
		
	    if(L_min>=E_min){
	    D_min=L_min-E_min;
	    
	    }else{
	    D_min=(60+L_min)-E_min;
	     }
	    if(L_hour>=E_hour){
	        if(L_min<E_min){
	       D_hour=(L_hour-1)-E_hour;
	        }else{
	        
	          D_hour=L_hour-E_hour;
	        }
	     }else{
	          if(L_min<E_min){
	       D_hour=(24+(L_hour-1))-E_hour;
	          }else{
	          D_hour=(24+L_hour)-E_hour;
	          }
	    }
	    
	    if(D_hour>12)
	    	D_day-=1;
	    System.out.println("\tThe Time Period Vehicle Has been parked\n");
	    
	 
	    System.out.println("\t\tMonths  :"+D_month);
	    System.out.println("\t\tDays    :"+D_day);
	    System.out.println("\t\tHours   :"+D_hour);
	    System.out.println("\t\tMinutes :"+D_min);
		
	    DateTime money=new DateTime();
	    money.Cost(D_month, D_day, D_hour,D_min,no);
	}

	public void Cost(int Month,int Day,int Hour,int Min, int Vno){
		
		int cash_1=(Month*30*30)+Day*30;
		int cash_2;
		int cash_3=0;
		if(Hour>3)
			cash_2=3*3+(Hour-3);
		else
			cash_2=Hour*3;
		
		if(Min>0)
			cash_3=3;
		
		Vehicle Obj=new Car();
		String [] VehType=Obj.Veh;
		
		System.out.println("\nTotal Charges :"+(cash_1+cash_2+cash_3)+"€");
		String type=timeInfo[Vno].setTYPE();
		timeInfo[Vno]=null;
		System.out.println("Vehicle DELETED");
		System.out.println("TYPE is "+type);
	}
	
}



