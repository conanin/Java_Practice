package com.alf.MemoryAllocation;

import org.junit.*;

/**
 * 
 */


/**
 * @author yinga
 *
 */
public class testAllocation {
	
	private static final int _1MB = 1024 * 1024;
	
	/**
	 * VM Argument: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 */
	@Test
	public void testAllocation1()
	{
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[ 2 * _1MB];
		allocation2 = new byte[ 2 * _1MB];
		allocation3 = new byte[ 2 * _1MB];
		System.out.println("Start to gc by system level");
		System.gc();
		allocation4 = new byte[ 4 * _1MB];
		
	}
	
	/**
	 * VM Argument: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * -XX:PretenureSizeThreshold=3145728 
	 */
	@Test
	public void testPretenureSizeThreshold()
	{
		byte[] allocation;
		allocation = new byte[ 4 * _1MB];
	}

}
