package model;

public abstract class duck {
	
		FlyBehavior flyBehavior;
		QuackBehavior quackBehavior;
		 
		public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
		}
		 
		public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
		}
		 
		abstract void display();
		 
		public void performFly() {
		flyBehavior.fiy();
		}
		 
		public void performQuack() {
		quackBehavior.quack();
		}
		 
		public void swim() {
		System.out.println("All ducks float, even decoys!");
		}
}


