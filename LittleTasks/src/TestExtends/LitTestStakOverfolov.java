package TestExtends;


public class LitTestStakOverfolov {
	  String variable;
    
    public LitTestStakOverfolov(){
     
     System.out.println("A");
     printVariable();
    }

    protected void printVariable(){
        variable = "variable is initialized in LitTestStakOverfolov Class";
        System.out.println("a");
       // System.out.println("variable value in 6565 = " + this.variable);
    }
}

