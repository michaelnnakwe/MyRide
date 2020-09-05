package com.myride.ws.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideProcessorRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RideProcessorRequest {

	@XmlElement(name="myRideInfo", required=true)
	private MyRideInfo myRideInfo;

	public MyRideInfo getMyRideInfo() {
		return myRideInfo;
	}

	public void setMyRideInfo(MyRideInfo myRideInfo) {
		this.myRideInfo = myRideInfo;
	}
		
	
}
