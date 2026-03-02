package Encaps;

public class HalkuKaAcc {

	   private double b=6000;
	   private short pin=0000;
	   //getter
	   public double getBal(short pin)
	   { if(this.pin==pin)
		   return this.b;
		   return -1;
	   }
	   //setter 1
	   public void setBalCredit(double amt)
	   {
		   this.b+=amt;
	   }
	   //setter 2
	   public void setBalDebit(double amt)
	   {
		   this.b-=amt;
	   }
}
