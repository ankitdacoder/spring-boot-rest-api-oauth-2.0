package com.fakeorder.foodorder;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fakeorder.foodorder.model.Role;
import com.fakeorder.foodorder.model.User;
import com.fakeorder.foodorder.service.UserService;

@SpringBootApplication
public class FoodorderApplication {
     
	 @Bean
	    public CommandLineRunner setupDefaultUser(UserService service) {
	        return args -> {
	            service.save(new User(
	                    "user", //username
	                    "user", //password
	Arrays.asList(new Role("USER"), new Role("ACTUATOR")),//roles 
	                    true//Active
	            ));
	        };
	    }
	    
	    @Bean
	    public PasswordEncoder getPasswordEncoder(){
	        return new BCryptPasswordEncoder();
	    }     
	
	public static void main(String[] args) {
		SpringApplication.run(FoodorderApplication.class, args);
	}

}
