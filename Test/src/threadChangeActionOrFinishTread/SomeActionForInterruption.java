package threadChangeActionOrFinishTread;

public class SomeActionForInterruption extends Thread{
	
	static volatile  boolean forChangeAction = true;
	
	public void changeAction () {
		forChangeAction =! forChangeAction;
	}
	@ Override
	public void run() {
	try{
		while(true){
					
				if(forChangeAction){
					++MainTread.valueToPrint;
				}else{
					--MainTread.valueToPrint;						
					 }
				System.out.print(MainTread.valueToPrint + " ");
			
				sleep(100); 
							
		}
	}catch (InterruptedException e) {
		System.out.print("\n interrupt has been catched :");
		e.printStackTrace();
	}
  }
}
