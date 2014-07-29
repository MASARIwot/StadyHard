package threadChangeActionOrFinishTread;

public class SomeActionIncrementOrDecrement implements Runnable{ 
	static volatile  boolean forChangeAction = true;
	static volatile  boolean forFinish = false;
		
	public void changeAction () {
		forChangeAction =! forChangeAction;
	}
	
	public void finish() {
		forFinish = true; 
	}
		
	@Override
	public void run() {
		System.out.println(": ");
		while(true){
			
			if(!forFinish){
				if(forChangeAction){
					++MainTread.valueToPrint;
				}else{
					--MainTread.valueToPrint;						
					 }
				System.out.print(MainTread.valueToPrint + " ");
			}else return;
			try{
				Thread.sleep(100); 
			}catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		
		
	}

}
