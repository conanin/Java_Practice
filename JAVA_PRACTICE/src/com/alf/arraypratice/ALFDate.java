package com.alf.arraypratice;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 15, 2015 11:15:58 AM 
*/
public class ALFDate 
{
	private int year = 0;
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int month = 0;
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	private int day = 0;
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public ALFDate( int _year, int _month, int _day )
	{
		this.year = _year;
		this.month = _month;
		this.day = _day;
	}
	
	public int compare( ALFDate date )
	{
		return year > date.year ? 1
				: year < date.year ? -1
				: month > date.month ? 1
				: month < date.month ? -1
				: day > date.day ? 1
				: day < date.day ? -1
				: 0;
	}
	
	public static void printALFDate( ALFDate date )
	{
		System.out.println( "Year: " + date.year + "\tMonth: " + date.month + "\tDay: " + date.day  );
	}
	
}