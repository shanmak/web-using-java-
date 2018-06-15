package sg.iss.team7clubapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Facility {

	@Id
	@Column (name="facility_id")
	private String FacilityId;

	@Column(name="facility_name")
	private String FacilityName;
	
	@Column(name="facility_type")
	private String FacilityType;
	
	@Column (name="description")
	private String Description;

	@Column(name="venue")
	private String Venue;
	
	@Column(name="image")
	private String Image;
	
	@Column(name="price")
	private double Price;
	
	@OneToMany (mappedBy="facility")
	private Set<BookingDetail> bookings = new HashSet<BookingDetail>();
	
	@OneToMany (mappedBy="facility")
	private Set<DamageReport> damageReports = new HashSet<DamageReport>();

	public Facility() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facility(String facilityId, String facilityName, String facilityType, String description, String venue,
			String image, double price) {
		super();
		FacilityId = facilityId;
		FacilityName = facilityName;
		FacilityType = facilityType;
		Description = description;
		Venue = venue;
		Image = image;
		Price = price;
	}

	public String getFacilityId() {
		return FacilityId;
	}

	public void setFacilityId(String facilityId) {
		FacilityId = facilityId;
	}

	public String getFacilityName() {
		return FacilityName;
	}

	public void setFacilityName(String facilityName) {
		FacilityName = facilityName;
	}

	public String getFacilityType() {
		return FacilityType;
	}

	public void setFacilityType(String facilityType) {
		FacilityType = facilityType;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getVenue() {
		return Venue;
	}

	public void setVenue(String venue) {
		Venue = venue;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Facility [FacilityId=" + FacilityId + ", FacilityName=" + FacilityName + ", FacilityType="
				+ FacilityType + ", Description=" + Description + ", Venue=" + Venue + ", Image=" + Image + ", Price="
				+ Price + "]";
	}
	
	
	
	
}
