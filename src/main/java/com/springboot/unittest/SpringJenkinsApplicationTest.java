package com.springboot.unittest;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.log.LoggerFactory;


@RestController
@RequestMapping("/app/test")
public class SpringJenkinsApplicationTest {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplicationTest.class);
	
	@GetMapping("/userlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public  getAllCustomers() {
		logger.info("test method is running...");
		return "Hi Hello";
	}
}
