
public class grabber implements Observer {
	 private String date,time;patient object;
	@Override
	public void update(String date, String time, patient i) {
		// TODO Auto-generated method stub
		   this.date=date;
		   this.time=time;
		   
		   this.object=i;
		   System.out.println("the patientid\n"+object+"  \n has appointment on "+date+time);
			
	}

}
