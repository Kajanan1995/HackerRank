import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Days_Between_TwoDates_HR30 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int fine = 0;
		String inputString1 = ip.nextLine();
		String inputString2 = ip.nextLine();
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");

		try {
			Date date1 = myFormat.parse(inputString1);
			Date date2 = myFormat.parse(inputString2);
			long diff = date1.getTime() - date2.getTime();
			Calendar cal = Calendar.getInstance();
			Calendar cal1 = Calendar.getInstance();
			cal.setTime(date1);
			cal1.setTime(date2);
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int month1 = cal1.get(Calendar.MONTH);
			int year1 = cal1.get(Calendar.YEAR);
			int count = year - year1;
			int count1 = month - month1;

			int dayss = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

			if (count1 <= 1 && count < 1) {
				fine = dayss * 15;
				if (fine < 0) {
					fine = 0;
				}
			}
			if (count1 > 1 && count >= 0) {
				fine = count1 * 500;
			}
			if (count > 0) {
				fine = 10000;
			}

			System.out.println(fine);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
