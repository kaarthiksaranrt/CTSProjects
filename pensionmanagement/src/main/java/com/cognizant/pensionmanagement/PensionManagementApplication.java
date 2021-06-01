package com.cognizant.pensionmanagement;

import java.sql.SQLException;
import java.util.List;

import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;







@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.cognizant.pensionmanagement.repository"})
public class PensionManagementApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(PensionManagementApplication.class);
	
	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
	    return Server.createTcpServer(
	      "-tcp", "-tcpAllowOthers", "-tcpPort", "8084");
	}
	

	public static void main(String[] args) {
		SpringApplication.run(PensionManagementApplication.class, args);
	
		
	}
	
	
}
