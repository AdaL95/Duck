package model;

public class RubberDuck extends duck {
	public RubberDuck(){
	flyBehavior=new FlynoWay();
	quackBehavior=new Silence();
   }
   public void display(){
	System.out.println("Yellow");			
   }
}


