package task2_2;

import java.util.ArrayList;
import interface_home2_2.HomeTaskInterface;
import interface_home2_2.HomeTaskVisitorInterface;
/**
 * 
 * @author ����
 *
 */
public class Home_Task_1 implements HomeTaskInterface {

	@Override
	public ArrayList<String> accept(HomeTaskVisitorInterface nomeVisitor , ArrayList<String> str ) {
	return	nomeVisitor.sortStringTask_1(str);
	
	}

}
