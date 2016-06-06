package model;

public class ReadheadDuck extends duck{
	public ReadheadDuck(){
		flyBehavior=new FlywithRocket();
		quackBehavior=new Squeak();
	}
	public void display(){
		System.out.println("Red Head");			
	
	}

}
