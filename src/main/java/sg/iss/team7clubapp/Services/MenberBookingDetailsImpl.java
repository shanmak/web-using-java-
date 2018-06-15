package sg.iss.team7clubapp.Services;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.team7clubapp.model.BookingDetail;
import sg.iss.team7clubapp.repository.MemberRespository;

@Service
public class MenberBookingDetailsImpl implements MemberService {

	@Resource
	private MemberRespository memberRespository;
	
	
	@Override
	@Transactional
	public ArrayList<BookingDetail> findmybookingdetails(int i){
		
		 ArrayList<BookingDetail> membookinlist=memberRespository.bookingDetails(i);
		 
		 
		 return membookinlist;
	}
	
}
