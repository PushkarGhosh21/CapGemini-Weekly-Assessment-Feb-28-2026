package currency;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Paisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency inr=Currency.getInstance("INR");
		Currency usd=Currency.getInstance("USD");
		System.out.println("INR Code:"+inr.getCurrencyCode());
		System.out.println("USD Code:"+usd.getCurrencyCode());
		
		BigDecimal amount=new BigDecimal("125000.75");
		NumberFormat india=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat uk=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(india.format(1234567));
		System.out.println(us.format(4567));
		
	}

}
