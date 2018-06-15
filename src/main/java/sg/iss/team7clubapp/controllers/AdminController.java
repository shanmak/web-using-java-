package sg.iss.team7clubapp.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sg.iss.team7clubapp.Services.BookingDetailsSrvices;

import sg.iss.team7clubapp.Services.FacilityService;
import sg.iss.team7clubapp.Services.UserService;

import sg.iss.team7clubapp.model.BookingDetail;
import sg.iss.team7clubapp.model.Facility;
import sg.iss.team7clubapp.model.User;

@RequestMapping(value = "/admin")
@Controller
public class AdminController {

	@Autowired
	private FacilityService FacilityService;

	@Autowired
	private BookingDetailsSrvices BookingDetailsSrvices;

	@Autowired
	private UserService UserService;

	@RequestMapping(value = "/listtype")
	public ModelAndView listtype() {

		ModelAndView mav = new ModelAndView("fac-type");
		java.util.List<String> faclist = FacilityService.findfactype();
		System.out.println("total size" + faclist.size());
		mav.addObject("faclist", faclist);

		return mav;

	}

	@RequestMapping(value = "/list")
	public ModelAndView list() {

		ModelAndView mav = new ModelAndView("fac-list");
		java.util.List<Facility> faclist = FacilityService.FindallFacility();
		System.out.println("total size" + faclist.size());
		mav.addObject("faclist", faclist);

		return mav;

	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView NewFacility() {

		ModelAndView mav = new ModelAndView("StudentFormNew", "Facility", new Facility());

		return mav;
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ModelAndView CreateFacility(@ModelAttribute Facility facility, final RedirectAttributes redirectAttributes) {

		ModelAndView mav = new ModelAndView();
		FacilityService.CreateFacility(facility);

		String mess = facility.getFacilityId();
		System.out.println("hello" + mess);
		redirectAttributes.addFlashAttribute("mess", mess);
		mav.setViewName("redirect:/admin/list");

		return mav;

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable String id, final RedirectAttributes redirectAttributes) {
		ModelAndView mav = new ModelAndView("redirect:/admin/list");
		Facility facility = FacilityService.findFacility(id);
		FacilityService.removeFacility(facility);
		String message = "The facility " + facility.getFacilityId() + " was successfully deleted.";
		redirectAttributes.addFlashAttribute("message", message);

		return mav;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editUserPage(@PathVariable String id) {
		ModelAndView mav = new ModelAndView("fac-edit");
		Facility Facility = FacilityService.findFacility(id);

		mav.addObject("Facility", Facility);
		System.out.println(Facility.toString());

		return mav;

	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editStudent(@ModelAttribute @Valid Facility Facility, @PathVariable String id,
			final RedirectAttributes redirectAttributes) {
		/*
		 * System.out.println("student"+student.toString()); if (result.hasErrors())
		 * return new ModelAndView("StudentFormEdit");
		 */

		FacilityService.updateFacility(Facility);
		ModelAndView mav = new ModelAndView("redirect:/admin/list");
		//// String message = "Student" + student.getNric() + " was successfully
		//// updated.";
		// redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public ModelAndView booking() {
		ModelAndView mav = new ModelAndView("admin-book-details");

		ArrayList<BookingDetail> bd = BookingDetailsSrvices.allBookingDetails();

		// System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+bd.size());

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

	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public ModelAndView userlist() {
		ModelAndView mav = new ModelAndView("user-list");
		java.util.List<User> userlist = UserService.findAllUser();

		mav.addObject("userlist", userlist);

		return mav;
	}

	@RequestMapping(value = "/deleteuser/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable int id, final RedirectAttributes redirectAttributes) {
		ModelAndView mav = new ModelAndView("redirect:/admin/userlist");
		User user = UserService.findUser(id);

		UserService.removeUser(user);

		String message = "The facility " + user.getUserId() + " was successfully deleted.";
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@RequestMapping(value = "/useredit/{id}", method = RequestMethod.GET)
	public ModelAndView editUserPage(@PathVariable int id) {
		ModelAndView mav = new ModelAndView("user-edit");

		User user = UserService.findUser(id);

		mav.addObject("user", user);

		return mav;

	}

	@RequestMapping(value = "/useredit/{id}", method = RequestMethod.POST)
	public ModelAndView editUser(@ModelAttribute @Valid User user, @PathVariable int id,
			final RedirectAttributes redirectAttributes) {

		System.out.println(id);
		System.out.println(user.getUserId());
		System.out.println(user.getEmail());

		System.out.println(user.getUserName());

		System.out.println(user.getPassword());

		System.out.println(user.getContactNumber());
		user.setUserID(id);
		UserService.updateUser(user);
		ModelAndView mav = new ModelAndView("redirect:/admin/userlist");
		//// String message = "Student" + student.getNric() + " was successfully
		//// updated.";
		// redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	/*
	 * @RequestMapping(value="/bookingdetails", method = RequestMethod.GET) public
	 * ModelAndView bookingDetails() {
	 * 
	 * ModelAndView mav= new ModelAndView("admin-booking-details");
	 * 
	 * ArrayList<BookingDetail> bookingDetails= new ArrayList<BookingDetail>();
	 * 
	 * ArrayList<Booking> bk=bs.finallbooking();
	 * 
	 * for (Booking booking : bk) {
	 * 
	 * System.out.println(booking.getBookingId()); BookingDetail
	 * bd=bds.FindBookingDetails(booking.getBookingId());
	 * 
	 * bookingDetails.add(bd); // System.out.println(bd.toString()); }
	 * 
	 * System.out.println(bk.toString());
	 * System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@"+bookingDetails.size());
	 * 
	 * return null; }
	 */

}
