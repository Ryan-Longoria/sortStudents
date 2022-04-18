package iex998;
/**
 * 
 * @author Ryan Longoria
 * @description This class will print out Student names, their food option, and their grade
 *
 */

class Student
{ 
	private String name;
	private String grade;
	private boolean option;
  
	/**
	 * 
	 * @param name: Will be the student name
	 * @param grade: Will be the student grade
	 * @param option: Will be the food choice (vegan or non-vegan)
	 */
	// Constructor calls setter
	public Student(String name, String grade, boolean option)
	{
		setter(name, grade, option);
	}
	
	// Simple getter method to return name
	public String getname()
	{
		return name;
	}
	
	// Simple getter method to return grade
	public String getgrade()
	{
		return grade;
	}
	
	// Simple getter method to return food choice
	public boolean getoption() 
	{
		return option;
	}
	
	// Setter method to get the Student name, grade, and food choice
	public void setter(String name, String grade, boolean option)
	{
		this.name = name;
		this.grade = grade;
		this.option = option;
	}
	
	// Modified toString method that sends the Student info to Lab1.java to print
	public String toString()  
	{
		String newStr;
		String bn = "\n* ";
		String dash = " - ";
		String veg = " (veg)";
		String nveg = " (non-veg)";
		if (getoption() == true)
		{
			newStr = bn + this.getname() + dash + this.getgrade() + veg;
			return newStr;
		}
		
		else 
		{
			newStr = bn + this.getname() + dash + this.getgrade() + nveg;
			return newStr;
		}
	}
}