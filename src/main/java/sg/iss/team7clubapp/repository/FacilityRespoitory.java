package sg.iss.team7clubapp.repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sg.iss.team7clubapp.model.Facility;

public interface FacilityRespoitory extends JpaRepository<Facility, String> {
	
	
    @Query("SELECT DISTINCT e.FacilityType FROM Facility e")
    ArrayList<String> findtype();
}
