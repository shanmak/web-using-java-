package sg.iss.team7clubapp.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.iss.team7clubapp.model.BookingDetail;

public interface BookingDetailsRepository extends JpaRepository<BookingDetail,Integer> {
	

	 //@Query(value= "SELECT * FROM booking_detail b WHERE booking_id=?1",nativeQuery = true)
	 @Query(value= "SELECT * FROM booking_detail group by booking_id ",nativeQuery = true)
	BookingDetail findBookingDetails(Integer i);
/*
	 @Query(value= "SELECT * FROM booking_detail group by booking_id ",nativeQuery = true)
		ArrayList<BookingDetail> allBookingDetails();*/
	 
	 @Query(value= "SELECT b.userid,b.booking_id,bd.facility_id,bd.reserved_date,bd.slot_number,bd.status,bd.detail_id FROM booking b, booking_detail bd where b.booking_id=bd.booking_id ",nativeQuery = true)
		ArrayList<BookingDetail> allBookingDetails();
	 
}

