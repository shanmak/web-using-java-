package sg.iss.team7clubapp.Services;

import java.util.ArrayList;

import sg.iss.team7clubapp.model.BookingDetail;

public interface BookingDetailsSrvices {
	
	
	BookingDetail FindBookingDetails(int i);
	
	ArrayList<BookingDetail> allBookingDetails();

}
