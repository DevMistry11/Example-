package com.Security.Example;

import com.Security.Example.Model.User;
import com.Security.Example.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(UserRepository user){
//		return args->{
//			user.save(new User("user1","{noop}password","USER"));
//			user.save(new User("user2","{noop}password",""));
//			user.save(new User("admin","{noop}password","ADMIN,USER"));
//
//		};
//	}
}
