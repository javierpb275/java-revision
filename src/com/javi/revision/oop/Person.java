package com.javi.revision.oop;

public class Person {
	// protected: access from own class or child classes
	protected String name;
	// private: access from own class only
	private String id;

	// static: class attribute (not object)
	public static String info;

	public static void sayHello() {
		System.out.println("hello");
	}

	// getters and setters for accessing and changing private and protected
	// attributes
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// protected: access from own class or child classes
	protected String getData() {
		return name + " " + id;
	}

	@Override
	public String toString() {
		return getData();
	}

}
