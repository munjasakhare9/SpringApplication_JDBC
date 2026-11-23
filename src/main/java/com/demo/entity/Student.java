package com.demo.entity;

public class Student {
	private Integer id;
	private String name;
	private String city;
	private Double perccentage;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getPerccentage() {
		return perccentage;
	}

	public void setPerccentage(Double perccentage) {
		this.perccentage = perccentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", perccentage=" + perccentage + "]";
	}
}
