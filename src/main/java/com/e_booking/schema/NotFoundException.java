package com.e_booking.schema;

import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;
import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;

@SoapFault(faultCode = FaultCode.SERVER)
public class NotFoundException extends Exception{
	public NotFoundException(String message) {
		super(message);
	}
}
