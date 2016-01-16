package com.alf.thread.concurrent.base;

/**
 * 隋唐演义大戏舞台。
 */
public class Stage extends Thread {

	public void run(){
		
		System.out.println("Welcome to watch Sui dynasty story.");
		//Make audience ready for watching.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("The show is coming...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("The show is starting...");
		
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		//Create thread using Runnable interface.
		Thread  armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"Sui Dynasty Army");
		Thread  armyOfRevolt = new Thread(armyTaskOfRevolt,"Peasant Army");
		
		//Start thread to fighting.
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		
		//staging thread sleep to make audience focus.
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Key person is coming.");
		
		Thread  mrCheng = new KeyPersonThread();
		mrCheng.setName("Mr.Cheng");
		
		System.out.println("He want to finish war and make people live better.");
		
		//ͣStop fight between armies.
		//ͣThe right way to stop thread.
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*
		 * KeyPerson show time.
		 */
		mrCheng.start();
		
		//All thread waits until KeyPerson finished show time.
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("The war is over.");
		System.out.println("Thanks for watching.");
		
	}
	
	public static void main(String[] args) {
		new Stage().start();

	}

}
