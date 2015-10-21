package com.alf.designPattern.observepattern;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 23, 2015 4:06:17 PM 
*/
public class WeatherStation {
	private static WeatherData weatherData = new WeatherData();
	private static CurrentBoardDisplay currentBoardDisplay = new CurrentBoardDisplay(weatherData);
	private static StatisticsBoardDisplay statisticsBoardDisplay = new StatisticsBoardDisplay(weatherData);
	private static ForecastBoardDisplay forecastBoardDisplay = new ForecastBoardDisplay(weatherData);
	
	public static void main(String[] args)
	{
		weatherData = new WeatherData(); 
		currentBoardDisplay = new CurrentBoardDisplay(weatherData);
		currentBoardDisplay.display();
		statisticsBoardDisplay.display();
		forecastBoardDisplay.display();
		weatherData.setMeasurement(10, 20, 30.00f);
		currentBoardDisplay.display();
		statisticsBoardDisplay.display();
		forecastBoardDisplay.display();
	}
}
