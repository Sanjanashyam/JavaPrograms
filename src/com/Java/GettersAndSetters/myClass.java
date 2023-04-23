package com.Java.GettersAndSetters;

public class myClass {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setName("Anaya");
		student1.setAge(8);
		
		System.out.println(student1.getName() + " is " + student1.getAge() + " years old");
		
		Student student2 = new Student();
		
		student2.setName("Aditi");
		student2.setAge(13);
		
        System.out.println(student2.getName() + " is " + student2.getAge() + " years old");
	}

}
