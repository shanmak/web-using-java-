package sg.iss.team7clubapp.Services;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.team7clubapp.model.Facility;
import sg.iss.team7clubapp.repository.FacilityRespoitory;

@Service
public class FacilityServiceImpl implements FacilityService   {
	
	@Resource
	private FacilityRespoitory facilityrep;
	
	
	@Override
	@Transactional
	 public ArrayList<Facility> FindallFacility(){
		
		ArrayList<Facility> list= (ArrayList<Facility>) facilityrep.findAll();	
		
		return list;	
	}
	
	@Override
	@Transactional
	 public ArrayList<String> findfactype(){
		
		ArrayList<String> list= (ArrayList<String>) facilityrep.findtype();	
		
		return list;	
	}
	@Override
	@Transactional
	 public Facility CreateFacility(Facility f) {
		
		return facilityrep.save(f);
	}
	
	
			
			@Override
			@Transactional
			public void removeFacility(Facility facility) {
				facilityrep.delete(facility);
			} 
		 
			@Override
			@Transactional
			public Facility findFacility(String facilityId) {
				return facilityrep.findOne(facilityId);

			} 
			@Override
			@Transactional
			public Facility updateFacility(Facility f)
			{
				return facilityrep.save(f);
			}
			

}
