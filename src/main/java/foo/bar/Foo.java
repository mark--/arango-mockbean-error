package foo.bar;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.Key;

@Document("foo")
public class Foo {

	@Key
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}