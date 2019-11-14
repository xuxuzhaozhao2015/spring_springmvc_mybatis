package top.xuxuzhaozhao.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.xuxuzhaozhao.domain.permission.User;
import top.xuxuzhaozhao.service.permission.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class TestUserService {
    @Autowired
    private IUserService userService;

    @Test
    public void TestFindUser(){
        String username = "名门汇";
        String passwor = "123";
        try {
            User user = userService.findUser(username,passwor);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
