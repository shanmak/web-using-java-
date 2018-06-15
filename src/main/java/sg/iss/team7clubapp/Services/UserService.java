package sg.iss.team7clubapp.Services;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import sg.iss.team7clubapp.model.Facility;
import sg.iss.team7clubapp.model.User;

public interface UserService {

	ArrayList<User> findAllUser();
	
	
	void removeUser(User user);
	
	User updateUser(User user);
	
	
	User findUser(int userId);
}