package com.myride.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.myride.ws.soap.dto.RideProcessorRequest;
import com.myride.ws.soap.dto.RideProcessorResponse;

@WebService(name="RideProcessor") 
public interface RideProcessor {

	@WebMethod 
	public @WebResult(name="response") RideProcessorResponse rideProcessorResponse(@WebParam(name="rideProcessorRequest") RideProcessorRequest rideProcessorRequest);
}
