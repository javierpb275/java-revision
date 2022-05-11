package com.javi.revision.oop;

//singleton pattern:Create 1 object. If I create new object we get the SAME object. Create only 1 instance.
//Example: data base connection 
public class Pattern {
	int data1;
	int data2;
	int data3;

	private static Pattern pattern = null;

	private Pattern() {
		this.data1 = 15;
		this.data2 = 18;
		this.data3 = 23;
	}

	public static Pattern getPattern() {
		if (Pattern.pattern == null)
			Pattern.pattern = new Pattern();
		return Pattern.pattern;
	}

}
