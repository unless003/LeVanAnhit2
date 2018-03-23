package Test;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
public class bai47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
			cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
			
			System.out.println("\nBaygiola: "+cdt.format(System.currentTimeMillis()));
	}

}
