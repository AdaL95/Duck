package model;

public class MallardDuck extends duck{
	
	public MallardDuck(){
		flyBehavior=new Flywithwings();
		quackBehavior=new Quack();
	}
	public void display(){
		System.out.println("Green Head");			
	}	

}
