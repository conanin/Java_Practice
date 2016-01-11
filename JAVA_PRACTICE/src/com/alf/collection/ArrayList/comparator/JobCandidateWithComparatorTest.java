package com.alf.collection.ArrayList.comparator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 29, 2015 2:22:25 PM 
*/
public class JobCandidateWithComparatorTest {

	ArrayList<JobCandidateWithComparator> jobCandidateList = new ArrayList<JobCandidateWithComparator>();
	
	@Before
	public void prepareData()
	{
		JobCandidateWithComparator jobCandidate1 = new JobCandidateWithComparator("Mark Smith", "Male", 26);
		JobCandidateWithComparator jobCandidate2 = new JobCandidateWithComparator("Sandy Hunt", "Female", 23);
		JobCandidateWithComparator jobCandidate3 = new JobCandidateWithComparator("Betty Clark", "Female", 20);
		JobCandidateWithComparator jobCandidate4 = new JobCandidateWithComparator("Andrew Styne", "Male", 24);
		
		jobCandidateList.add(jobCandidate1);
		jobCandidateList.add(jobCandidate2);
		jobCandidateList.add(jobCandidate3);
		jobCandidateList.add(jobCandidate4);
	}
	

	@Test
	public void testGetSortedJobCandidateByAge() {
		JobCandidateWithComparatorSorter jobCandidateWithComparatorSorter = new JobCandidateWithComparatorSorter( jobCandidateList );
		ArrayList<JobCandidateWithComparator> sortedJobCandidate = jobCandidateWithComparatorSorter.getSortedJobCandidateByAge();
		
		System.out.println("-----Sorted JobCandidate by age: Desscending-----");
		for (JobCandidateWithComparator jobCandidate : sortedJobCandidate ) 
		{
			System.out.println(jobCandidate);
		}
	}
	
	@Test
	public void testGetSortedJobCandidateByName() {
		JobCandidateWithComparatorSorter jobCandidateWithComparatorSorter = new JobCandidateWithComparatorSorter( jobCandidateList );
		ArrayList<JobCandidateWithComparator> sortedJobCandidate = jobCandidateWithComparatorSorter.getSortedJobCandidateByName();
		
		System.out.println("-----Sorted JobCandidate by name: Ascending-----");
		for (JobCandidateWithComparator jobCandidate : sortedJobCandidate ) 
		{
			System.out.println(jobCandidate);
		}
	}
}