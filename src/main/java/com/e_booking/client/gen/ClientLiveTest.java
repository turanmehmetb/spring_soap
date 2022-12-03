package com.e_booking.client.gen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebClientConfig.class, loader = AnnotationConfigContextLoader.class)
public class ClientLiveTest {

    @Autowired
    CarRentalClient client;
    
    @Test
    public void test1() {
        ListReservationsResponseType response = client.listReservations();
        assertEquals(0, response.getReservations().size());
    }
    
    @Test
    public void test2() {
    	Reservation reservation = new Reservation();
    	reservation.brand = "Honda";
    	reservation.model = "Civic";
    	reservation.pickupTime = "11";
    	reservation.pickupLocation = "ankara";
    	reservation.dropoffTime = "12";
    	reservation.dropoffLocation = "ankara";

        ReserveResponseType response = client.addReservation(reservation);
        assertEquals(0, response.getReservationId());
    }
    
    @Test
    public void test3() {
    	Reservation reservation = new Reservation();
    	reservation.brand = "Ford";
    	reservation.model = "Fiesta";
    	reservation.pickupTime = "11";
    	reservation.pickupLocation = "ankara";
    	reservation.dropoffTime = "12";
    	reservation.dropoffLocation = "ankara";

        ReserveResponseType response = client.addReservation(reservation);
        assertEquals(1, response.getReservationId());
    }

    @Test
    public void test4() {
        ListReservationsResponseType response = client.listReservations();
        assertEquals(2, response.getReservations().size());
    }
    
    @Test
    public void test5() {
        CancelResponseType response = client.cancelReservation(1);
        assertEquals(1, response.getReservationId());
    }
    
    @Test
    public void test6() {
        ListReservationsResponseType response = client.listReservations();
        assertEquals(1, response.getReservations().size());
    }
}
