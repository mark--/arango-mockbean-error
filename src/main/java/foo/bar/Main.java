package foo.bar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arangodb.springframework.annotation.EnableArangoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableArangoRepositories(basePackageClasses = Main.class)
public class Main implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	}

}
