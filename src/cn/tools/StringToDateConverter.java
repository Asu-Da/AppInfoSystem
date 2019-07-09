package cn.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String,Date> {

	private String datePattern;  //鏃ユ湡鏍煎紡, yyyy-MM-dd鎴杫yyyMMdd
	public StringToDateConverter(String datePattern) {
		this.datePattern = datePattern;  //datePattern鐨勫�灏变负yyyy-MM-dd
	}
	public Date convert(String str) {
		Date date = null;
		try {
			//灏嗗瓧绗︿覆杞崲鎴怐ate绫诲瀷 
			date = new SimpleDateFormat(datePattern).parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}




}
