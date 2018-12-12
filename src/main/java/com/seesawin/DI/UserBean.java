package com.seesawin.DI;

import java.util.Date;

public class UserBean {
	private String id;
	private String name;
	private int age;
	private Date brDate;
	private Order order;

	public UserBean() {
	}

	public UserBean(String id, String name, int age, Date brDate, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.brDate = brDate;
		this.order = order;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getBrDate() {
		return brDate;
	}

	public void setBrDate(Date brDate) {
		this.brDate = brDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", age=" + age + ", brDate=" + brDate + ", order=" + order + "]";
	}

}
