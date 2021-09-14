//package com.reformix.database.springdatabase;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//
//import com.reformix.database.springdatabase.jdbc.PersonJdbcDao;
//
////@SpringBootApplication
//public class SpringJdbcDatabaseApplication implements CommandLineRunner {
//	@Autowired
//	PersonJdbcDao dao;
//	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJdbcDatabaseApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		logger.info("Data for all -->{}",dao.findAll()); 
//		logger.info("Data for id 10001 -->{}",dao.findById(10001));
//		logger.info("Data for location New York -->{}",dao.findByLocation("New York"));
//		logger.info("Delete for id 10002 -->number of rows deleted{}",dao.deleteById(10002));
////		
//	}
//
//}