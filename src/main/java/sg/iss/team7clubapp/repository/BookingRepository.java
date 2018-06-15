package sg.iss.team7clubapp.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.iss.team7clubapp.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

	
	
}
