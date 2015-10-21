package com.alf.designPattern.observepattern;

import java.util.ArrayList;
import java.util.Observable;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 23, 2015 3:41:51 PM 
*/
public class WeatherData extends Observable{
	private ArrayList<IObserver> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public ArrayList<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<IObserver> observers) {
		this.observers = observers;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	
	public WeatherData()
	{
//		observers = new ArrayList<IObserver>();
	}
	
//	@Override
//	public void registerObserver(IObserver iObserver) {
//		observers.add(iObserver);
//	}
//	
//	@Override
//	public void removeObserver(IObserver iObserver) {
//		int i = observers.indexOf(iObserver);
//		if( i > 0)
//		{
//			observers.remove(i);
//		}
//	}
	
//	@Override
//	public void notifyObservers() {
//		for( int i = 0; i < observers.size(); i ++ )
//		{
//			IObserver observer = (IObserver)observers.get(i);
//			observer.update(this.temperature, this.humidity, this.pressure);
//		}
//	}
	
	public void measurementChange()
	{
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurement(float temperature, float humidity, float pressure )
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChange();
	}	
}
