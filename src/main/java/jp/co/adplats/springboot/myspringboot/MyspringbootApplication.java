package jp.co.adplats.springboot.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MyspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootApplication.class, args);
	}
	
	@GetMapping
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>("Hello there...",HttpStatus.OK);
	}

}
