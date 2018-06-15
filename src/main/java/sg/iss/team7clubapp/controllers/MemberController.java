package sg.iss.team7clubapp.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sg.iss.team7clubapp.Services.FacilityService;
import sg.iss.team7clubapp.Services.MemberService;
import sg.iss.team7clubapp.Services.UserService;
import sg.iss.team7clubapp.model.Booking;
import sg.iss.team7clubapp.model.BookingDetail;
import sg.iss.team7clubapp.model.User;

@RequestMapping(value = "/mem")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private UserService userservice;
	
	
	@RequestMapping(value = "/mybook/{1}",method = RequestMethod.GET)
public ModelAndView mybookinglist(HttpServletRequest request) {
		
		ModelAndView mav= new ModelAndView("admin-book-details");
		/*User u = new User();
		u.setUserID(1);
		
		Booking b = new Booking();
		b.setUser(u);
		System.out.println(b.getUser().getUserId());
		*/
		int id=6;
		User user = userservice.findUser(id);
		int i=user.getUserId();
		
	   System.out.println(user.getUserName());
	   System.out.println(user.getUserId());
		
		ArrayList<BookingDetail> bd=memberService.findmybookingdetails(i); // pass member session userid
		
		
		
			
			for (BookingDetail bookingDetail : bd) {

				System.out.println(bookingDetail.getBooking().getUser().getUserName());
				System.out.println(bookingDetail.getBooking().getBookingId());
				System.out.println(bookingDetail.getReservedDate());
				System.out.println(bookingDetail.getFacility().getFacilityName());
				System.out.println(bookingDetail.getSlot().getSlotDescription());
				System.out.println(bookingDetail.getStatus());
			}
			
		
		
		mav.addObject("bd", bd);
				
				return mav;
		
	}
}
