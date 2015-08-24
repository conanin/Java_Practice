/**
 * 
 */
package com.alf;

/**
 * @author yinga
 *
 */
public class Dispatch {

	static class qq{}
	
	static class _360{}
	
	public static class Father
	{
		public void hardChoice(qq args)
		{
			System.out.println("Father choose qq");
		}
		
		public void hardChoice(_360 args)
		{
			System.out.println("Father choose 360");
		}
	}
	
	public static class Son extends Father
	{
		@Override
		public void hardChoice(qq args)
		{
			System.out.println("Son choose qq");
		}
		
		@Override
		public void hardChoice(_360 args)
		{
			System.out.println("Son choose 360");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Father father = new Father();
		Son son = new Son();
		father.hardChoice(new qq());
		father.hardChoice(new _360());
		son.hardChoice(new _360());
		son.hardChoice(new qq());

	}

}