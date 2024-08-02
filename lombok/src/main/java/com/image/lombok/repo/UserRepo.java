package com.image.lombok.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.image.lombok.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	// select * from tbl_user where country="india"
	public List<User> findByCountry(String cname);

	// select * from tbl_user where age =5
	public List<User> findByAge(Integer cage);

	// select * from tbl_user where age>=5
	public List<User> findByAgeGreaterThanEqual(Integer a);

	// select * from tbl_user where country in("india","usa");
	public List<User> findByCountryIn(List<String> countries);

	// select * from tbl_user where country='india' and age=5;
	public List<User> findByCountryAndAge(String cnmae, Integer cage);
	
	// select * from tbl_user where country='india' and age=5 and gender="male";
	public List<User> findByCountryAndAgeAndGender(String cname, Integer age, String gender);
	
	//custom query
	
	//Hql query
	@Query(value="from User")
	public List<User> getAllUsersHql();
	
	//native sql query
	@Query(value = "SELECT * FROM tbl_user", nativeQuery = true)
	public List<User> getALlUsersSql();
	
	@Query(value = "From User Where country=:cname and age=:cage")
	public List<User> getAllUserByCountryAndAge(String cname,Integer cage);
	

}
