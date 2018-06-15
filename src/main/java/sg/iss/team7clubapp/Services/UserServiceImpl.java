package sg.iss.team7clubapp.Services;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.team7clubapp.model.Facility;
import sg.iss.team7clubapp.model.User;
import sg.iss.team7clubapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Resource
	private UserRepository userRepository;
	
	/* (non-Javadoc)
	 * @see sg.iss.team7clubapp.Services.UserService#FindallFacility()
	 */
	@Override
	@Transactional
	 public ArrayList<User> findAllUser(){
		
		ArrayList<User> list= (ArrayList<User>) userRepository.findAll();	
		
		return list;	
	}
	
	@Override
	@Transactional
	public void removeUser(User user) {
		userRepository.delete(user);
	} 
	
	@Override
	@Transactional
	public User findUser(int userId) {
		return userRepository.findOne(userId);

	} 
	
	@Override
	@Transactional
	public User updateUser(User u)
	{
		return userRepository.saveAndFlush(u);
	}

}
