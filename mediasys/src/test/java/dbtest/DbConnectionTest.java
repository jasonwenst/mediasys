package dbtest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.entity.User;
import com.spring.service.UserService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"../spring-jpa.xml"})
public class DbConnectionTest {

	@Resource
	private UserService userService;
	
	@Test
	public void findUserTest() {
		User user = userService.getUserByUsername("jason");
		if(user != null) {
			System.out.print(user.toString());
		} 
		
	}


	
	
}
