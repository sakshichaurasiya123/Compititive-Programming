/*package whatever //do not write package name here */

import java.io.*;
import java.time.temporal.ChronoUnit;
import java.time.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		String startdateString=in.next();
		String lastdateString=in.next();
		LocalDate datebegin=LocalDate.parse(startdateString);
		LocalDate dateend=LocalDate.parse(lastdateString);
		long noofdays=ChronoUnit.DAYS.between(datebegin,dateend);
		System.out.println(noofdays);
	}
}
