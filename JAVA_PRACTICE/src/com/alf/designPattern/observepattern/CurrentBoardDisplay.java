package com.alf.designPattern.observepattern;

import java.util.Observable;
import java.util.Observer;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 23, 2015 3:57:05 PM 
*/
public class CurrentBoardDisplay implements Observer, IDisplayElement{
	private WeatherData weatherData;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentBoardDisplay( WeatherData _weatherdata)
	{
		this.weatherData = _weatherdata;
		//weatherData.registerObserver(this);
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println( "Current Condition is:\nTemperature:\t" + temperature + "\nHumidity:\t" + humidity + "\nPressure:\t" + pressure );
	}

	@Override
	public void update(Observable o, Object arg) {
		if ( o instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
		}
	}

//	@Override
//	public void update(float temp, float humidity, float pressure) {
//		this.temperature = temp;
//		this.humidity = humidity;
//		this.pressure = pressure;
//	}
}
