package iex998;
/**
 * 
 * @author Ryan Longoria
 * @description This class will print out Zone names
 *
 */

class Zone
{ 
	private String name;
	private Student arr[];
  
	/**
	 * 
	 * @param name: Takes in the Zone name
	 * @param size: Takes in the array size
	 */
	// Constructor calls setter and sets array
	public Zone(String name, int size)
	{
		setter(name);
		arr = new Student[size];
	}

	// A simple getter method that returns the Zone name
	public String getName()
	{
		return name;
	}
	
	// A setter method that takes in and sets the Zone name
	public void setter(String name)
	{
		this.name = name;
	}

	// Takes in a student as parameter and adds to the array
	private int num;
	public void addStudent(Student obj)
	{
		arr[num] = obj;
		num++;
	}

	// Modified toString method that sends the Zone names to Lab1.java
	public String toString()
	{
		String bn = "\n\n";
		int j = 0;

		String z = " Zone: ";
		if (this.getName() == "Cafeteria")
			bn = "\n";
		
		String str = bn + this.getName() + z;
		int i = 0;
		while (i < num)
		{
			str += arr[i];
			i++;
		}
		
		return str;
	} 
}