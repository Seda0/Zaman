package Zamanim;

public class Timel {

	
   private int hour;
   private int minute;
   private int second;
public Timel(int hour, int minute, int second) {
	super();
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}
   
   public void setHour(int saat, int dakika, int saniye) {
	   
	   if(saat>0 || saat<23 || dakika>0 || dakika<59 || saniye>0 || saniye<59 ) {
		   System.out.println("Girmiş Oldugunuz Saat Sinirlarin disinda");
		   
		  this.hour = saat;
		this.minute = dakika;
		this.second = saniye; 
	   }
		 
   }
		
		public String display() {
			return String.format("%0,2d: %0,2d: %0,2:",getHour(),getMinute(),getSecond(), "Zaman ");
		}
	}


