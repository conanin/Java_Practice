package com.alf.stringpractice;

import org.junit.Assert;
import org.junit.Test;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Oct 21, 2015 10:39:35 AM 
* String 字符串常量
* StringBuffer 字符串变量（线程安全）
* StringBuilder 字符串变量（非线程安全）
* 
*/
public class TestStringBasic {
	
	/*
	 * String 有个特点： 如果程序中有多个String对象，都包含相同的字符串序列，
	 * 那么这些String对象都映射到同一块内存区域，所以两次new String(“hello”)生成的两个实例，
	 * 虽然是相互独立的，但是对它们使用hashCode()应该是同样的结果。
	 * Note: 字符串数组并非这样，只有String是这样。即hashCode对于String，是基于其内容的。
	 * 
	 * String、StringBuffer、StringBuilder 都实现了 CharSequence 接口，内部都是用一个char数组实现，虽然它们都与字符串相关，但是其处理机制不同。
	 * String：是不可改变的量，也就是创建后就不能在修改了。
	 * StringBuffer：是一个可变字符串序列，它与 String一样，在内存中保存的都是一个有序的字符串序列（char 类型的数组），不同点是 StringBuffer 对象的值都是可变的。
	 * StringBuilder：与 StringBuffer 类基本相同，都是可变字符换字符串序列，不同点是 StringBuffer是线程安全的，StringBuilder是线程不安全的。
	 * 
	 * 使用场景
	 * 使用 String 类的场景：在字符串不经常变化的场景中可以使用 String 类，例如常量的声明、少量的变量运算。
	 * 使用 StringBuffer 类的场景：在频繁进行字符串运算（如拼接、替换、删除等），并且运行在多线程环境中，则可以考虑使用 StringBuffer，例如 XML 解析、HTTP 参数解析和封装。
	 * 使用 StringBuilder 类的场景：在频繁进行字符串运算（如拼接、替换、和删除等），并且运行在单线程的环境中，则可以考虑使用 StringBuilder，如 SQL 语句的拼装、JSON 封装等。

	 * 分析
	 * 在性能方面，由于 String 类的操作是产生新的 String 对象，而 StringBuilder 和 StringBuffer 只是一个字符数组的扩容而已，所以 String 类的操作要远慢于 StringBuffer 和 StringBuilder。
	 * 简要的说， String 类型和 StringBuffer 类型的主要性能区别其实在于 String 是不可变的对象, 因此在每次对 String 类型进行改变的时候其实都等同于生成了一个新的 String 对象，然后将指针指向新的 String 对象。所以经常改变内容的字符串最好不要用 String ，因为每次生成对象都会对系统性能产生影响，特别当内存中无引用对象多了以后， JVM 的 GC 就会开始工作，那速度是一定会相当慢的。
	 * 而如果是使用 StringBuffer 类则结果就不一样了，每次结果都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，再改变对象引用。所以在一般情况下我们推荐使用 StringBuffer ，特别是字符串对象经常改变的情况下。
	 */
	@Test
	public void testHashCode()
	{
		String[] hellos = "Hello,Hello,hello".split(",");
		int hashCode0 = hellos[0].hashCode();
		int hashCode1 = hellos[1].hashCode();
		int hashCode2 = hellos[2].hashCode();
		System.out.println( "hashCode0 is " + hashCode0 );	
		System.out.println( "hashCode1 is " + hashCode1 );
		System.out.println( "hashCode2 is " + hashCode2 );
		System.out.println( hashCode0 == hashCode1 );
		Assert.assertTrue("hashcode0 and hashcode1 are the same.", hashCode0 == hashCode1 && hashCode1 != hashCode2 );
		
		String hello = new String("hello");
		System.out.println( hello.hashCode());
		Assert.assertTrue("hashcode2 has the same hashcode with hello String object", hashCode2 == hello.hashCode());
	}

}
