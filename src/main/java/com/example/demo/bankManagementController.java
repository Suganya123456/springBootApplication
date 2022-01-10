package com.example.demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.User;

@RestController
@RequestMapping(value = "/api/users")

public class bankManagementController {
	
	private List<User> user = new ArrayList<User>();
	bankManagementController() {
	this.user = addUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getEmployees() {
	return this.user;
	}
	
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public User getEmployee(@PathVariable("id") Long id) {
//	return this.user.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
//	}
	

	List<User> addUsers() {
		List<User> customer = new ArrayList<>();
		User user1 = addUser( "Suganya","S", "9876543210", "suganya@gmail.com");
		User user2 = addUser( "Saranya","S", "9087654321", "saranya@gmail.com");
		customer.add(user1);
		customer.add(user2);
		return customer;
		}
		User addUser(String fname, String lname, String phoneNo, String email) {
		User users = new User(fname, lname, phoneNo, email);
		return users;
		}
}
