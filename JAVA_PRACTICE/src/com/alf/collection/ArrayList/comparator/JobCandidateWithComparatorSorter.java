package com.alf.collection.ArrayList.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 29, 2015 2:45:22 PM 
*/
public class JobCandidateWithComparatorSorter 
{
	 ArrayList<JobCandidateWithComparator> jobCandidate = new ArrayList<JobCandidateWithComparator>();
	 
	 public JobCandidateWithComparatorSorter(ArrayList<JobCandidateWithComparator> jobCandidate) 
	 {
		 this.jobCandidate = jobCandidate;
	 }
	 
	 public ArrayList getSortedJobCandidateByAge() 
	 {
		 Collections.sort(jobCandidate,JobCandidateWithComparator.ageComparator);
		 return jobCandidate;
	 }
	 
	 public ArrayList getSortedJobCandidateByName() 
	 {
		 Collections.sort(jobCandidate,JobCandidateWithComparator.nameComparator);
		 return jobCandidate;
	 }
}
