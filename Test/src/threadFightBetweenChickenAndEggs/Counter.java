package threadFightBetweenChickenAndEggs;

public  class  Counter  extends Thread  {
	private static   int i = 0;
	private static int sleepTime = 100;
		
	public static synchronized int getI() {
		i++;
		return i;
	}
	public static  int get�urrentI() {
		return i;
	}
	
	public static  void cleanCounter() {
		i =0;
	}
	public static  void setCounter(int idex) {
		//Counter.i = i; or
		i = idex;
	}
	public static synchronized  void currentSleep(int time) {
		
		try {sleep(time);} catch (InterruptedException e) {e.printStackTrace();}
	}
	public static synchronized  void currentSleep() {
		
		try {sleep(sleepTime);} catch (InterruptedException e) {e.printStackTrace();}
	}
	

}
