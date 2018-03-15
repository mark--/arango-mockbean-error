package foo.bar;

import org.springframework.context.annotation.Configuration;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.config.AbstractArangoConfiguration;

@Configuration
public class ArangoConfig extends AbstractArangoConfiguration {

	@Override
	public ArangoDB.Builder arango() {
		return new ArangoDB.Builder();
	}

	@Override
	public String database() {
		return "database";
	}
}
