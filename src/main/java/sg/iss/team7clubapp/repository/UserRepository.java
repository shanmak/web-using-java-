package sg.iss.team7clubapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import sg.iss.team7clubapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	

}
