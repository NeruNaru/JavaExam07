package com.javaex.vo;

public class PhonebookVO {
	//field
	private int id;
	private String name;
	private String hp;
	private String company;
	//editor
	public PhonebookVO(int id, String name, String hp, String company) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	public PhonebookVO() {
		super();
	}
	//method g/s
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	//method normal
	@Override
	public String toString() {
		return "PhonebookVO [id=" + id + ", name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
}
