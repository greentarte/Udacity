package java;
import java.util.Calendar;
import java.util.Scanner;
public class Today2 {
	 public static String getDay(String day, String month, String year) {
		    String[] arr = {"SUNDAY","MONDAY", "TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    int y = Integer.parseInt(year);
		    int m = Integer.parseInt(month)-1;
		    int d = Integer.parseInt(day);
		        cal.set(y, m, d);
		        int result = cal.get(Calendar.DAY_OF_WEEK)-1;
		        return arr[result];
		        
		        
		        
		    }
		  public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        String month = in.next();
		        String day = in.next();
		        String year = in.next();
		        
		        System.out.println(getDay(day, month, year));
		    }
		}
