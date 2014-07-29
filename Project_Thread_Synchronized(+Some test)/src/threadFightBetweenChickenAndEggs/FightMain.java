package threadFightBetweenChickenAndEggs;

public class FightMain {
	static{System.out.println("Start Class: FightMain. Package:threadFightBetweenChickenAndEggs  ");
	Counter.setCounter(10);
	System.out.println("lets Fight! "+ "�������� i����� ��������� :: "+ Counter.get�urrentI());
	}
	
	private static EggsSay egg;
	private static int index =0;
	
	public static void main(String[] args) throws InterruptedException{
		//**********************************************************
		Thread chicken = new Thread(new ChickenSay()); //Implement
		egg = new EggsSay(); //!! Extend
		//**********************************************************
		chicken.start();
		egg.start();
		//**********************************************************
		for(int i = 0 ; i < 10 ; i++){
			Counter.currentSleep();
			System.out.println("�������� ������ ��������� ::  "
								+ Counter.get�urrentI()
								+"- ���������::  "
								+ index++);
		}
		
		
		 if(chicken.isAlive() && !egg.isAlive()){
			 chicken.join(); 
			 	System.out.println("������ ���� ����� ::" + Counter.get�urrentI());
			}else if(egg.isAlive() && !chicken.isAlive() ){ 
				egg.join(); 
				System.out.println("������ ���� ���� ::" + Counter.get�urrentI());}
			else {
			 egg.join(); 
			 chicken.join();  
			 	System.out.println("��� �� ����::" + Counter.get�urrentI());}
		 
		 //while(chicken.isAlive() && egg.isAlive()){ } 
		
		 System.out.println("������� ��������� ! �������� i����� ��������� ::" + Counter.get�urrentI());
		
	}
	
	
}
