package com.springboot.starter;

public class Hello {
	
	private String perfix;
	
	private String name;

	public String getPerfix() {
		return perfix;
	}

	public void setPerfix(String perfix) {
		this.perfix = perfix;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello [perfix=" + perfix + ", name=" + name + "]";
	}
	
	
	
	

}
