package io.jichuan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//add @RestController
@RestController
public class HerokuDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(HerokuDemo1Application.class, args);
	}
	//add request handling 
	@RequestMapping("/")
    String home() {
		System.out.println("hello from jichuan");
        return "Hello World from Jichuan!";        
    }

}
