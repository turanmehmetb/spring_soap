package com.e_booking.client.gen;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CarRentalClient extends WebServiceGatewaySupport {

    public ListReservationsResponseType listReservations() {
        ListReservationsRequestType request = new ListReservationsRequestType();

        ListReservationsResponseType response = (ListReservationsResponseType) getWebServiceTemplate().marshalSendAndReceive(request);
        return response;
    }

    public ReserveResponseType addReservation(Reservation reservation) {
    	ReserveRequestType request = new ReserveRequestType();
    	request.setReservation(reservation);
        ReserveResponseType response = (ReserveResponseType) getWebServiceTemplate().marshalSendAndReceive(request);
        return response;
    }

    public CancelResponseType cancelReservation(int reservationId) {
    	CancelRequestType request = new CancelRequestType();
    	request.setReservationId(reservationId);
    	System.out.print(reservationId);
    	CancelResponseType response = (CancelResponseType) getWebServiceTemplate().marshalSendAndReceive(request);
        return response;
    }
}