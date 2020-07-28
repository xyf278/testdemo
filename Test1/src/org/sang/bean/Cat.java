package org.sang.bean;

public class Cat {
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Cat [catId=" + catId + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	private int catId;
	private String name;
}
