package com.fsl.spring.autowiring;

public class Player {

	private String position;
	
	private County county;
	
	public County getCounty() {
		return county;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(County county) {
		this.county=county;
		this.position="";
	}
	
	public Player(County county,String position) {
		this.county=county;
		this.position=position;
	}
	
	public void setCounty(County county) {
		this.county = county;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
