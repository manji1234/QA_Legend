package utilities;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class DateUtility 
{
	public static String get_UserLogin_Date(String format)
	{
		DateFormat dateformat=new SimpleDateFormat(format);
		Date currentdate=new Date();
		return dateformat.format(currentdate);
	}
}
