package com.alf.designPattern.ObservePattern;

import java.util.Observable;
import java.util.Observer;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 23, 2015 4:22:00 PM 
*/
public class StatisticsBoardDisplay implements Observer, IDisplayElement{
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsBoardDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		//weatherData.registerObserver(this);
		weatherData.addObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(Observable o, Object arg) {
		if ( o instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData)o;
//			this.temperature = weatherData.getTemperature();
//			this.humidity = weatherData.getHumidity();
//			this.pressure = weatherData.getPressure();
		}
	}
}
