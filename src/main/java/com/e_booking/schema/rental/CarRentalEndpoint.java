package com.e_booking.schema.rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarRentalEndpoint {

	@Autowired
	CarRentalRepository repository;

	private static final String NAMESPACE_URI = "http://e-booking.com/schema/rental";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ListReservation")
	@ResponsePayload
	public ListReservationsResponseType listReservations(@RequestPayload ListReservationsRequestType request) {
		ListReservationsResponseType response = new ListReservationsResponseType();
	   repository.getReservations().forEach(element -> {
		   response.getReservations().add(element);
	   });

	   return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddReservation")
	@ResponsePayload
	public ReserveResponseType addReservation(@RequestPayload ReserveRequestType request) {
		ReserveResponseType response = new ReserveResponseType();
		response.setReservationId(repository.addReservation(request.getReservation()));

	    return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CancelRequest")
	@ResponsePayload
	public CancelResponseType cancelReservation(@RequestPayload CancelRequestType request) throws NotFoundException {
		CancelResponseType response = new CancelResponseType();
		int deletedId = repository.deleteReservation(request.getReservationId());
		
		if(deletedId == -1) throw new NotFoundException("Reservation is not exist!");
		else response.setReservationId(deletedId);

	    return response;
	}

}