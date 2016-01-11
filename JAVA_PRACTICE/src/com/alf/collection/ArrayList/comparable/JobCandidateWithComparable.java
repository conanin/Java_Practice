package com.alf.collection.ArrayList.comparable;
/** 
 * Comparable 是排序接口。
 * 若一个类实现了Comparable接口，就意味着“该类支持排序”。  即然实现Comparable接口的类支持排序，
 * 假设现在存在“实现Comparable接口的类的对象的List列表(或数组)”，则该List列表(或数组)可以通过 Collections.sort（或 Arrays.sort）进行排序。
 * 此外，“实现Comparable接口的类的对象”可以用作“有序映射(如TreeMap)”中的键或“有序集合(TreeSet)”中的元素，而不需要指定比较器。
 * 使用 Comparable 对 ArrayList 排序是一种常用的方法。但是你必须知道有某些限制。你想要排序的对象的类必须实现 Comparable 
 * 并覆写 compareTo()方法。这基本上意味着你将只能基于一个成员变量来比较对象(例子中的年龄字段)。
 * 
 * Comparable是带有单一 compareTo()方法的接口。一个实现了 Comparable 接口的类对象可以与其它同类型的对象进行比较，实现 Comparable 接口的类需要重写 compareTo()方法，
 * 这个方法接收一个同类型的对象，并实现这个对象和传递给方法的另一个对象比较的逻辑。compareTo()方法返回int类型的比较结果，分别代表下面的含义：
 *	正值表示当前对象比传递给 comPareTO()的对象大
 *	负值表示当前对象比传递给 comPareTO()的对象小
 *	零表示两个对象相等
 * 
 * @author: conanin
   @E-mail: conanin@live.cn
 * @version: 1.0  
 * @Creation date： Dec 29, 2015 10:49:08 AM 
*/

public class JobCandidateWithComparable implements Comparable<JobCandidateWithComparable> 
{
	private String name;
	public String getName() {
		return name;
	}
	
	private String gender;
	public String getGender() {
		return gender;
	}

	private int age;
	public int getAge() {
		return age;
	}

	public JobCandidateWithComparable( String name, String gender, int age ) 
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	 
	@Override 
	//Compare JobCandidateWithComparable by age.
	public int compareTo(JobCandidateWithComparable candidate) 
	 {
		 return ( this.getAge() < candidate.getAge() ? -1 : (this.getAge() == candidate.getAge() ? 0 : 1 ) );
	 }
	 
	 @Override
	 public String toString() 
	 {
		 return " Name: " + this.name + ", Gender: " + this.gender + ", age:" + this.age;
	 }
}
