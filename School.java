package iex998;
/**
 * 
 * @author Ryan Longoria
 * @description This class will print out a Welcome message with the school name
 *
 */ 
class School
{
	private String name; // Name of the school
	private Zone arr[];  // array of Zone objects
    
	/**
	 * 
	 * @param name: Will take in the name of the school
	 * @param size: Will take in the size of the array
	 */
	// Constructor calls setter method and creates the array
	public School(String name,int size)
	{
		setter(name);
		arr = new Zone[size];
	}
	
	// A simple getter method that returns the name of the school
	public String getName()
	{
		return name;
	}
	
	// Sets the name of the school and takes in Student name
	public void setter(String name)
	{
		this.name = name;
	}
	
	// Takes as a parameter a Zone object and returns nothing
	private int arrNum;
	public void addZone(Zone obj)
	{
		arr[arrNum] = obj;
		arrNum++;
	}
	
	// Modified toString method to send Welcome message to Lab1.java
	public String toString()
	{
		String wel = "Welcome to ";
		String line = "\n------------------------";
		String excl = "!";
		String str = wel + this.getName() + excl + line;
		int i = 0;
		while(i < arrNum)
		{
			str += arr[i];
			i++;
		}
  
		return str;
	}
}