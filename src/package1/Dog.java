package package1;

import java.util.Comparator;

public class Dog implements Comparable<Dog>,Comparator<Dog>{

	String name;
	int age;
	
	public Dog(String n, int a){
		this.name = n;
		this.age = a;
	}
	public Dog(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int compareTo(Dog other){
		
		if(this.age == other.age){
		return(this.name).compareTo(other.name);
	}else {
		return (this.age - other.age);
	}
	}
	
	public int compare(Dog d1,Dog d2){
		return d1.name.compareTo(d2.name);
	}
		
	
	public String toString(){
		
		String str = name + " " + age;
		
		return str;
		
	}
}

