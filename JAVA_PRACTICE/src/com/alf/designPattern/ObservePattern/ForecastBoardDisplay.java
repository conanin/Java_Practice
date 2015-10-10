package com.alf.designPattern.ObservePattern;

import java.util.Observable;
import java.util.Observer;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 23, 2015 4:23:54 PM 
*/
public class ForecastBoardDisplay implements Observer, IDisplayElement{
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable weatherData;

	public ForecastBoardDisplay(Observable weatherData) {
		this.weatherData = weatherData;
//		weatherData.registerObserver(this);
		weatherData.addObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
	}
}
