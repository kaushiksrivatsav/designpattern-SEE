import java.util.*;
public class Doctor {
 
	private String name,reason; private Doctor object;private String  date;String time;
	private String availdate;int numofslot;dateandtime [] obj=new dateandtime[500];
	int j=0;ArrayList <dateandtime>info=new ArrayList<dateandtime>();
	public void getpatientdetails(String name ,String reason){
		this.name=name;
		this.reason=reason;
	}
	public void  fixtimeslots(){
		System.out.println("enter the number of slots you want set");
		Scanner sn=new Scanner(System.in);
		numofslot=sn.nextInt();
		
	
       for(int i=0;i<numofslot;i++){			
		
		System.out.println("enter the date you are available doctor");
		
		
		this.availdate=sn.next();
		addslot(availdate);}
	}
	
	public void addslot(String date){
		
		info.add((new dateandtime(date)));
		
	
	}
	public void display(){
		int g=info.size();
		for(int i=0;i<g;i++){
			dateandtime f=info.get(i);
			f.display();
		}
		
	}

	 public int checks2(dateandtime f,String pt){
	int aaj	= f.checks(pt);
	if (aaj== 1)
		return 1;
	else 
		return 0;
	 }
	public int  checks(String date, String pt) {
		// TODO Auto-generated method stub
		 int g=info.size(); int aaj = 0;
			for(int i=0;i<g;i++){
				dateandtime f=info.get(i);
			String a	=f.getdate();
				if(a.equals(date)){
					
				aaj=checks2(f,pt );
				}
			} 
			if(aaj==1)
				return 1;
			else 
				return 0;
	}
	public void urgent(patient a){
		dateandtime f=info.get(0);
		    String bb= f.getdate();
		 String aa= f.urgent();
		 a.fixappointment(bb, aa, a);
	}
	
}
