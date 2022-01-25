package type8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SDF
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		SimpleDateFormat sd1 = new SimpleDateFormat("dd-MM-yy");
		String s1 = sd1.format(d1);
		System.out.println(s1);

		SimpleDateFormat sd2 = new SimpleDateFormat("MM/dd/YYYY");
		String s2 = sd2.format(d1);
		System.out.println(s2);

		SimpleDateFormat sd3 = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
		String s3 = sd3.format(d1);
		System.out.println(s3);

		SimpleDateFormat sd4 = new SimpleDateFormat(
				"'day:'dd',month:'MMM',year:'yyyy''");
		String s4 = sd4.format(d1);
		System.out.println(s4);
		System.out.println("done");
	}
}
