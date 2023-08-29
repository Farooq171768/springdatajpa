package cgg.springdatajpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cgg.springdatajpa.entities.User1;

public interface User1Repository extends CrudRepository<User1, Integer>{

	//Custom methods
	List<User1> findByName(String name);
	List<User1> findByNameAndCity(String name, String city);
	List<User1> findByStatusContaining(String word);
	List<User1> findByStatusLike(String pattern);
	
	
	//@Query 
	//1.JPQL
	@Query("select u from User1 u")
	List<User1> getAllUsers();
	
	@Query("select u from User1 u where u.name=:n")
	List<User1> getUsersByName(@Param("n") String name);
	
	@Query("select u from User1 u where u.name=:n and u.city=:c")
	List<User1> getUsersByName(@Param("n") String name,@Param("c") String city);
	
	//2.Native queries
	@Query(value="select * from user1",nativeQuery=true)
	List<User1> getUsers();
	
	@Query(value="select * from user1 where city=:c",nativeQuery=true)
	List<User1> getUsersByCity(@Param("c") String city);
	

	
}
