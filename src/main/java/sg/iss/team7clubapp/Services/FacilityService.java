package sg.iss.team7clubapp.Services;

import java.util.ArrayList;



import sg.iss.team7clubapp.model.Facility;

public interface FacilityService {

	/* (non-Javadoc)
	 * @see sg.iss.team7clubapp.Services.Facility#FindallFacility()
	 */
	ArrayList<Facility> FindallFacility();
	
	Facility CreateFacility(Facility f);

	void removeFacility(Facility facility);

	Facility findFacility(String facilityId);
	
	Facility updateFacility(Facility facility);
	
	ArrayList<String> findfactype();

}