package com.e_booking.schema.rental;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CarRentalRepository {

	private List<Reservation> reservations = new ArrayList<>();

	public List<Reservation> getReservations() {
		return reservations;
	}

	public int addReservation(Reservation reservation) {
		int id = 0;
		if(reservations.size() != 0) id = reservations.get(reservations.size()-1).getReservationId()+1;
		reservation.setReservationId(id);
		reservations.add(reservation);

		return id;
	}

	public int deleteReservation(int reservationId) {
		reservations.removeIf(element -> element.reservationId == reservationId);

		return reservationId;
	}
}