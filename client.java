import java.util.*;
public class client {
	public static void main(String []args){
patient [] patients; int numberofpatients;int time;String patienttime;String date;
	Scanner sn=new Scanner(System.in);slotiterator slot;int kk=0;
	Doctor doctor1 = new Doctor();
    doctor1.fixtimeslots();	
    doctor1.display();
   System.out.println("enter the number of patients");
   numberofpatients=sn.nextInt();
   patients =new patient[numberofpatients];

   for (int i=0;i<numberofpatients;i++){
	 
	   patient p=new patient();
	   patients[i]=p;
	   
	   
   }
   for (int i=0;i<numberofpatients;i++){
   patients[i].observers(patients);}
   
   for (int i=0;i<numberofpatients;i++){
	   System.out.println("enter the urgency value ");
	    kk=sn.nextInt();
	       if(kk==0){
	      System.out.println("enter the date and time");
   date=sn.next();
   patienttime=sn.next();
   int aaj= doctor1.checks(date, patienttime);
   if (aaj==1){
	   patient t=patients[i];
	 patients[i].fixappointment(date, patienttime, t) ; 
   }
   else{
	   System.out.println("try another time");
   }
	   
   }
	       
	       else {   
	   doctor1.urgent(patients[i]);}  
	       }
   
	
}

}
