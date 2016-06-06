package test;

import model.FlynoWay;
import model.MallardDuck;
import model.duck;

public class DuckTest {
	public static void main(String[] args){
		duck duck=new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlynoWay());
		duck.performFly();
		
	}
	

}
