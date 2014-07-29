package threadTest;
//import threadTest.LitTestStakOverfolov.Test;

public class streamFirstClass {

	public static void main(String[] args) throws InterruptedException {
	
	//******************************************************
	threadTest obj = new threadTest(); // new threadTest("Start");
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj);
    Thread t3 = new Thread(obj);
    t1.start();
    t2.start();
    t3.start();
    //******************************************************
    
    while(t3.isAlive() || t2.isAlive() || t1.isAlive()){} //it will wait for previous thread  and than it run
    System.out.println("****************tRunn**************************************");
    Thread tRunn = new Thread(new SomeRunnableInterFace());
    tRunn.start();
    tRunn.join();
    //******************************************************    
    System.out.println("******************tRunnFinish************************************");
    //****************************************************** 
    threadTest2 obj2  = new threadTest2();
    Thread t11 = new Thread(obj2);
    Thread t22 = new Thread(obj2);
    Thread t33 = new Thread(obj2);
    t33.start();
    t22.start();
    t11.start();
    //****************************************************** 
    while(t33.isAlive() || t22.isAlive() || t11.isAlive()){}
    Thread someTest = new Thread(new Runnable() {
    	{System.out.println("*********************Hi! from Thread(new Runnable... it*s working*******************************");}
		@Override
		public void run() {
			for (int i = 0; i <= 10; i++) {
		         System.out.println("i::"+ i );
		     }
			
		}
	});
   
    someTest.start();
    someTest.join();
    System.out.println("*********************Some Test is Finished********************************");
    
    
    
    
	}
}