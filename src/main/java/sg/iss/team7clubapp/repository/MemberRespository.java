package sg.iss.team7clubapp.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sg.iss.team7clubapp.model.BookingDetail;

public interface MemberRespository extends JpaRepository<BookingDetail,Integer> {
	
	
	
	@Query(value="SELECT b.userid,b.booking_id,bd.facility_id,bd.reserved_date,bd.slot_number,bd.status,bd.detail_id FROM booking b, booking_detail bd where b.booking_id=bd.booking_id and b.userid=?1",nativeQuery = true)
	ArrayList<BookingDetail> bookingDetails(int i);

}
