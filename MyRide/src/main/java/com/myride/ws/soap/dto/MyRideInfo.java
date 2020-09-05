package com.myride.ws.soap.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MyRideInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyRideInfo {

	@XmlElement(name="id")
	private int id;
	
	@XmlElement(name="from")
	private String from;
	
	@XmlElement(name="to")
	private String to;
	
	@XmlElement(name="cost")
	private Double cost;
	
	@XmlElement(name="dateofride")
	private Date dateofride;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getDateofride() {
		return dateofride;
	}

	public void setDateofride(Date dateofride) {
		this.dateofride = dateofride;
	}
	
		
}
