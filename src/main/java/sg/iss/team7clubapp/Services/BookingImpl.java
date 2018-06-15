package sg.iss.team7clubapp.Services;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sg.iss.team7clubapp.model.Booking;
import sg.iss.team7clubapp.repository.BookingRepository;
import sg.iss.team7clubapp.repository.FacilityRespoitory;


@Service
public class BookingImpl implements BookingService {

	
	
	@Resource
	private BookingRepository Bookingrep;
	
	
	@Override
	public ArrayList<Booking> finallbooking() {
		// TODO Auto-generated method stub
		ArrayList<Booking> bklist=(ArrayList<Booking>) Bookingrep.findAll();
		
		return bklist;
	}

}
