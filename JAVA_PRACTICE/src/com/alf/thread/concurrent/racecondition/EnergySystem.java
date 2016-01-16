package com.alf.thread.concurrent.racecondition;
/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Jan 12, 2016 1:29:32 PM 
*/
public class EnergySystem {
	     //Box to store energy.
		 private final double[] energyBoxes;
		 private final Object lockObj = new Object();
		 
		 /**
		  * 
		  * @param n    Count of energy box
		  * @param initialEnergy Initial energy stored in each box.
		  */
		 public EnergySystem(int n, double initialEnergy){
			 energyBoxes = new double[n];
			 for (int i = 0; i < energyBoxes.length; i++)
				 energyBoxes[i] = initialEnergy;
		 }
		 
		 /**
		  * Energy transfer from one box to another one.
		  * @param from The source box 
		  * @param to   The destination box
		  * @param amount Count of energy to transfer.ֵ
		  */
		 public void transfer(int from, int to, double amount){
			 
			 synchronized(lockObj){
				 //while loop to make sure that task is prevented from execution rather than race CPU when condition does not matched.
				 while (energyBoxes[from] < amount){
					 try {
						//Put current thread to Wait Set when condition is not met.
						lockObj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
				 
				 
				 System.out.print(Thread.currentThread().getName());
				 energyBoxes[from] -= amount;
				 System.out.printf(" from %d transfer %10.2f unit energy to %d", from, amount, to);
				 energyBoxes[to] += amount;
				 System.out.printf(" Total energy: %10.2f%n", getTotalEnergies());
				//Wake up all the thread waiting for the lockObj.
				 lockObj.notifyAll();
			 }
			 
		 }
		 
		 /**
		  * Get total energy
		  */
		 public double getTotalEnergies(){
			 double sum = 0;
			 for (double amount : energyBoxes)
				 sum += amount;
			 return sum;
		 }
		 
		 /**
		  * Get mount of energy box.
		  */
		 public  int getBoxAmount(){
			 return energyBoxes.length;
		 }

}
