package test;

import com.usian.pojo.User;
import com.usian.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//测试类
@SpringBootTest
public class ApplicationTestDome {
    @Autowired
    UserService userService;
    @Test
    public void findpage(){
        List<User> fiandpage = userService.fiandpage();
        for (User user : fiandpage) {
            System.out.println(user);
        }
    }

}
