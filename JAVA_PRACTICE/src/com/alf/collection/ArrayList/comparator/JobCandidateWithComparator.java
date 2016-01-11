package com.alf.collection.ArrayList.comparator;

import java.util.Comparator;

/** 
 * Comparator 是比较器接口。
 * 若需要控制某个类的次序，而该类本身不支持排序(即没有实现Comparable接口)；那么，我们可以建立一个“该类的比较器”来进行排序。
 * “比较器”只需要实现Comparator接口即可。也就是说，我们可以通过“实现Comparator类来新建一个比较器”，然后通过该比较器对类进行排序。
 * 
 * Comparator 接口与Comparable 接口相似也提供了一个单一的比较方法叫作 compare()。
 * 然而，与 Comparable的 compareTo()方法不同的是，这个 compare()接受两个同类型的不同对象进行比较。
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 29, 2015 10:59:39 AM 
*/
public class JobCandidateWithComparator {
	private String name;
	private String gender;
	private int age;

	public JobCandidateWithComparator(String name, String gender, int age) 
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}

	public String getGender() 
	{
		return gender;
	}
	 
	public int getAge() 
	{
		return age;
	}
	
	public static Comparator<JobCandidateWithComparator> ageComparator = new Comparator<JobCandidateWithComparator>()
	{
		@Override
		public int compare(JobCandidateWithComparator jc1, JobCandidateWithComparator jc2) 
		{
			return ( jc2.getAge() < jc1.getAge() ? -1 : ( jc2.getAge() == jc1.getAge() ? 0 : 1));
		}
	 };
	 
	 public static Comparator<JobCandidateWithComparator> nameComparator = new Comparator<JobCandidateWithComparator>() 
	 {
		 @Override
		 public int compare(JobCandidateWithComparator jc1, JobCandidateWithComparator jc2) 
		 {
			 return (int) ( jc1.getName().compareTo( jc2.getName() ));
		 }
	 };
	 
	 @Override
	 public String toString() 
	 {
		 return " Name: " + this.name + ", Gender: " + this.gender + ", age:" + this.age;
	 }
}
