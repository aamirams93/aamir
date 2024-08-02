package in.image;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimes {

	public String  newTime()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
}
