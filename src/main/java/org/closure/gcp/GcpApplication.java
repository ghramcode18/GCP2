package org.closure.gcp;


import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GcpApplication {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
			SpringApplication.run(GcpApplication.class, args);
		
	}

}
