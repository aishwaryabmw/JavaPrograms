
import java.util.*;
import java.text.SimpleDateFormat;
public class getweek {
	public static void main(String args[]) {
	//Calendar c = GregorianCalendar.getInstance();
	java.util.Calendar c = java.util.Calendar.getInstance();

	System.out.println("Current week before " + Calendar.DAY_OF_WEEK);

	// Set the calendar to monday of the current week
	//c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	//System.out.println(Calendar.MONDAY + "Monday");
	System.out.println("Current week after " + Calendar.DAY_OF_WEEK);
	c.add(Calendar.DATE, 4);
	// Print dates of the current week starting on Monday
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		String startDate = "", endDate = "";
	startDate = df.format(c.getTime());
	c.add(Calendar.DATE, 6);
	endDate = df.format(c.getTime());

	System.out.println("Start Date = " + startDate);
	System.out.println("End Date = " + endDate);
	}
}
