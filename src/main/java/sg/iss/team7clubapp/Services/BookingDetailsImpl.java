package sg.iss.team7clubapp.Services;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.team7clubapp.model.BookingDetail;
import sg.iss.team7clubapp.repository.BookingDetailsRepository;

@Service
public class BookingDetailsImpl implements BookingDetailsSrvices {

	
	
	@Resource
	private BookingDetailsRepository BookingDetailsrep;
	@Override
	public BookingDetail FindBookingDetails(int i) {
		
	BookingDetail bkdetails=BookingDetailsrep.findBookingDetails(i);
			
			return bkdetails;
	}
	
	@Transactional
	@Override
	public ArrayList<BookingDetail> allBookingDetails(){
		
		
		ArrayList<BookingDetail> bk=BookingDetailsrep.allBookingDetails();
		return bk;
	}

}
