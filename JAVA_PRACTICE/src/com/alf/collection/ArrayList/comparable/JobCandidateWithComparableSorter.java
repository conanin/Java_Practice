package com.alf.collection.ArrayList.comparable;

import java.util.ArrayList;
import java.util.Collections;

/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Dec 30, 2015 9:45:38 AM 
*/
public class JobCandidateWithComparableSorter {
	 ArrayList<JobCandidateWithComparable> jobCandidate = new ArrayList<JobCandidateWithComparable>();
	 
	 public JobCandidateWithComparableSorter(ArrayList<JobCandidateWithComparable> jobCandidate) 
	 {
		 this.jobCandidate = jobCandidate;
	 }
	 
	 public ArrayList<JobCandidateWithComparable> getSortedJobCandidateByAge() {
		 Collections.sort(jobCandidate);
		 return jobCandidate;
	 }
}