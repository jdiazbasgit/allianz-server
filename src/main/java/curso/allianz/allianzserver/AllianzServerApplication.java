package curso.allianz.allianzserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
@EnableAutoConfiguration
public class AllianzServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllianzServerApplication.class, args);
	}

}
