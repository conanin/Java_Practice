package com.alf.collection.ArrayList.comparable;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 30, 2015 9:48:58 AM 
*/
public class JobCandidateWithComparableSorterTest {

	ArrayList<JobCandidateWithComparable> jobCandidateList = null;
	JobCandidateWithComparableSorter jobCandidateSorter = null;
	ArrayList<JobCandidateWithComparable> sortedJobCandidate = null;
	
	@Before
	public void prepareArrayList()
	{
		JobCandidateWithComparable jobCandidate1 = new JobCandidateWithComparable("Mark Smith", "Male", 26);
		JobCandidateWithComparable jobCandidate2 = new JobCandidateWithComparable("Sandy Hunt", "Female", 23);
		JobCandidateWithComparable jobCandidate3 = new JobCandidateWithComparable("Betty Clark", "Female", 20);
		JobCandidateWithComparable jobCandidate4 = new JobCandidateWithComparable("Andrew Styne", "Male", 24);
		jobCandidateList = new ArrayList<JobCandidateWithComparable>();
		jobCandidateList.add(jobCandidate1);
		jobCandidateList.add(jobCandidate2);
		jobCandidateList.add(jobCandidate3);
		jobCandidateList.add(jobCandidate4);
	}
	
	/**
	 * Test method for {@link com.alf.collection.ArrayList.comparable.JobCandidateWithComparableSorter#getSortedJobCandidateByAge()}.
	 */
	@Test
	public void testGetSortedJobCandidateByAge() {
		jobCandidateSorter = new JobCandidateWithComparableSorter(jobCandidateList);
		sortedJobCandidate = jobCandidateSorter.getSortedJobCandidateByAge();
		
		System.out.println("-----Sorted JobCandidate by age: Ascending-----\n");
		for (JobCandidateWithComparable jobCandidate : sortedJobCandidate) {
			System.out.println(jobCandidate);
		}
	}
}
