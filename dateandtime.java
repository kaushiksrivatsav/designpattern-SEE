import java.util.ArrayList;
import java.util.Scanner;


public class dateandtime {
private String date,time;ArrayList <String>timeslots=new ArrayList<String>();String aa;int slots;
  dateandtime(String date ){
	 this.date=date;
	 System.out.println("number of time slots for this day");
	 Scanner sn=new Scanner (System.in);
	 slots=sn.nextInt();
	 for (int i=0;i<slots;i++){
		 System.out.println("enter the time");
		 time=sn.next();
		 timeslots.add( time);
	 }
  }
  public String getdate(){
	return date;
	  
  }
  public String gettime(){
	return time;
	  
  }
  public void display(){
	  System.out.println(" the date is "+date);
	  int f=timeslots.size();
	  System.out.println(" the timeslots are ");
	  for(int i=0;i<f;i++){
		  System.out.println(timeslots.get(i));
	  }
  }
  public int checks(String pt){
	  int f=timeslots.size();
	  if(f !=0) {
		  
	  for(int i=0;i<f;i++){
		  if(timeslots.get(i)!=null)
		  aa =timeslots.get(i);
		 if(aa.equals(pt)){
			 if(timeslots.get(i)!=null)
			 {timeslots.remove(i);
			 return 1;}
		 }  
	  }
	
  }
	  
		return 0;
	}
  public String urgent(){
	  String aa =timeslots.get(0);
	  timeslots.remove(0);
	  return aa;
  }
}
