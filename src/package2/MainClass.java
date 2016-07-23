package package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import package1.Dog;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(new Dog("Puppy",2));
		dogs.add(new Dog("Jimmy",6));
		dogs.add(new Dog("Lily",6));
		dogs.add(new Dog("Steve",6));
		dogs.add(new Dog("Jony",1));
		dogs.add(new Dog("Maxy",8));
		
		Collections.sort(dogs);
		
		System.out.println(dogs);
		
		
		
		dogs.add(new Dog("Shagy",7));
		
		Collections.sort(dogs,new Dog());
		
		System.out.println(dogs);
		
	}

}
