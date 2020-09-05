package com.myride.ws.soap;

import com.myride.ws.soap.dto.RideProcessorRequest;
import com.myride.ws.soap.dto.RideProcessorResponse;

public class RideProcessorImpl implements RideProcessor {

	@Override
	public RideProcessorResponse rideProcessorResponse(RideProcessorRequest rideProcessorRequest) {
		// process logic for ride
		
		RideProcessorResponse rideProcessorResponse = new RideProcessorResponse();
		rideProcessorResponse.setResult(true);
		
		return rideProcessorResponse;
	}

}
