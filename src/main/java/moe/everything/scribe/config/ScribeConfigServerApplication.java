package moe.everything.scribe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("moe.everything")
public class ScribeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScribeConfigServerApplication.class, args);
	}

}
