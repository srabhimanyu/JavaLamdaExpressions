package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

class Animal{
	private String type;
	private boolean canJump;
	private boolean canSwim;
	
	public Animal(String type,boolean canJump,boolean canSwim) {
		this.type=type;
		this.canJump=canJump;
		this.canSwim=canSwim;	
	} // parameterized constructor
	
	
	public boolean canJump() {
		
		return canJump;
	}
	
	public boolean canSwim() {
		
		return canSwim;
		
	}
	
	public String getType() {
		
		return type;
	}
}

interface CheckAnimal{
	
	boolean check(Animal animal);
}

class CheckCanJump implements CheckAnimal{
	
   @Override
   public boolean check(Animal animal) {
	   
	   return animal.canJump();
   }
}


public class LambdaExpressions {
	
	// LambdaExpression is a method without a name or anonymous method
	
	
	
	public static void main(String args[]) {
		
		List<Animal> animals=new ArrayList<>();
		animals.add(new Animal("fish",false,true));
		animals.add(new Animal("rabbit",true,false));
		animals.add(new Animal("dog",true,true));
		
	//	print(animals,new CheckCanJump());
		print(animals,animal->animal.canSwim());
	//	print(animals,animal->!animal.canSwim());
			
	}
	
	private static void print(List<Animal> animals,CheckAnimal filter) {
		
		for(Animal animal:animals) {
			
			if(filter.check(animal)) {
				
				System.out.println(animal.getType());
			}
		}
		
	}
	

}
