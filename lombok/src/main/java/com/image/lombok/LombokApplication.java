package com.image.lombok;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.image.lombok.entity.User;
import com.image.lombok.repo.UserRepo;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LombokApplication.class, args);
		UserRepo rs = ctx.getBean(UserRepo.class);

		User u1 = new User(101, "aamir", "male",2, "ind"); 
		User u2 = new User(103, "ams", "male",  5,"ind"); 
	     User u3 = new User(104, "sal", "male",5, "ind"); 
	  //   rs.saveAll(Arrays.asList(u1,u2,u3)); 

	//	Optional<User> findById = rs.findById(101);

//		if (findById.isPresent()) {
//			System.out.println(findById.get());
//		} else {
//			System.out.println("User not found");
//		}

//		Iterable<User> allById = rs.findAllById(Arrays.asList(101, 103, 104));
//		
//		allById.forEach(user ->{
//			System.out.println(user );
//		});

//		Iterable<User> allById = rs.findAll();
//
//		for (User i : allById) {
//			System.out.println(i);
//		}
		
//		long count = rs.count();
//		System.out.println("Total count :" + count);
//		
//		
//		boolean existsById = rs.existsById(103);
//		System.out.println("count by id "+ existsById);
		
//		rs.deleteById(103);
//		rs.deleteAllById(Arrays.asList(101,104));
	     
	     // customize method to reterive data
//	    List<User> findbycountry = rs.findByCountry("ind");
//	    findbycountry.forEach(user->{
//	    	System.out.println(user);
//	    });
//	     Scanner sc = new Scanner(System.in);
//	     int a = sc.nextInt();
	     
//	   List<User> findbyage=rs.findByAge(a);
//	   findbyage.forEach(user->{
//		   System.out.println(user);
//	   });
		
	   
//	   List<User> findbyage=rs.findByAge(a);
//	   findbyage.forEach(user->{
//		   System.out.println(user);
//	   });
		System.out.println("----------------------------------------");
//	   List<User> list = rs.findByCountryIn(Arrays.asList("Ind","usa"));
//	   
//	   list.forEach(user->{
//		   System.out.println(user);
//	   });
		
//		List<User> list =rs.findByCountryAndAge("usa",2);
//		list.forEach(user->{
//			   System.out.println(user);
//		   });
		
//		List<User> l=  rs.findByCountryAndAgeAndGender("Ind", 5, "male");
//		l.forEach(user->{
//			System.out.println(user);
//		});
		
		//custom query method calling
		
		//calling hql query method calling
		/*
		 * List<User>ps=rs.getAllUsersHql(); ps.forEach(user->{
		 * System.out.println(user); });
		 */
		
		//calling native sql query method calling
		
		/*
		 * List<User>ps=rs.getALlUsersSql(); ps.forEach(user->{
		 * System.out.println(user); });
		 */
		List<User> ps=rs.getAllUserByCountryAndAge("ind", 5);
		ps.forEach(user->{
			System.out.println(user);
		});
		
	
	}

}
