package foo.bar;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DAOtest {

	@Autowired
	Repository repository;

	// If this MockBean is used, the Spring application context cannot be created
	// with the
	// following exception:
	//
	// org.springframework.beans.factory.UnsatisfiedDependencyException: Error
	// creating bean with name 'repository': Unsatisfied dependency expressed
	// through constructor parameter 1: Ambiguous argument values for parameter of
	// type [com.arangodb.springframework.core.ArangoOperations] - did you specify
	// the correct bean references as arguments?
	//
	// If the MockBean is removed, the Spring application context IS constructed and
	// the test fails due to a missing arango instance (which is ok for this
	// example)
	//
	// Feel free to try it for yourself
	@MockBean
	Bar bar;

	@Test
	public void searchRecordNotExistingReturnNull() {
		assertNull(repository.findOne("fookey"));
	}

}