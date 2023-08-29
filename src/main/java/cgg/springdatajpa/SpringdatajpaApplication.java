package cgg.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cgg.springdatajpa.dao.User1Repository;
import cgg.springdatajpa.entities.User1;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringdatajpaApplication.class, args);
		User1Repository userRepo = context.getBean(User1Repository.class);
		
		//Saving single object
//		User1 user = new User1();
//		user.setName("Farooq");
//		user.setCity("HYD");
//		user.setStatus("Programmer");
//		
//		User1 user1 = userRepo.save(user);
//		System.out.println(user1);
		
		//Saving mltiple objects
//		User1 user1 = new User1();
//		user1.setName("Raju");
//		user1.setCity("HYD");
//		user1.setStatus("Python Programmer");
//		
//		
//		User1 user2 = new User1();
//		user2.setCity("HYD");
//		user2.setName("Ajay");
//		user2.setStatus("Java Programmer");
//		
//		
//		List<User1> users = List.of(user1,user2);
//		
//		Iterable<User1> result = userRepo.saveAll(users);
//		result.forEach(System.out::println);
		
		
		//Update the user of id 3:
//		Optional<User1> optional = userRepo.findById(3);
//		User1 user1 = optional.get();
//		user1.setCity("Chennai");
//		User1 result = userRepo.save(user1);
//		System.out.println(result);
		
		
		//How to get the data
		//findById(id)- returns optional containing your data
//		Iterable<User1> users = userRepo.findAll();
//		users.forEach(System.out::println);
		
		
		//Deleting the user element
//		userRepo.deleteById(3);
//		System.out.println("deleted");
		
		
		//Deleting multiple user elements
//		Iterable<User1> allUsers = userRepo.findAll();
//		allUsers.forEach(System.out::println);
//		userRepo.deleteAll(allUsers);
//		System.out.println("all users deleted");
		
//		List<User1> name = userRepo.findByName("Farooq");
//		name.forEach(System.out::println);
		
//		List<User1> name = userRepo.findByNameAndCity("Farooq","HYD");
//		name.forEach(System.out::println);
//		System.out.println("----------------------");
//		
//		List<User1> list = userRepo.findByStatusContaining("C Programmer");
//		list.forEach(System.out::println);
//		System.out.println("----------------------");
//		
//		List<User1> list2 = userRepo.findByStatusLike("%Prog%");
//		list2.forEach(System.out::println);
		
//		List<User1> allUsers = userRepo.getAllUsers();
//		allUsers.forEach(System.out::println);
//		System.out.println("----------------------");
		
//		List<User1> name = userRepo.getUsersByName("Farooq");
//		name.forEach(System.out::println);
		
//		List<User1> name = userRepo.getUsersByName("Farooq","HYD");
//		name.forEach(System.out::println);
		
//		List<User1> users = userRepo.getUsers();
//		users.forEach(System.out::println);
		
		List<User1> list = userRepo.getUsersByCity("Mumbai");
		list.forEach(System.out::println);
		
	}

}
