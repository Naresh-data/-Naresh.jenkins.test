package com.Naresh.Naresh.jenkins.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	public static	Logger logger=LoggerFactory.getLogger(Application.class);
	
	
	@Test
	void contextLoads() {
		logger.info("test case started");
		assertEquals(true, true);
		
	}

}