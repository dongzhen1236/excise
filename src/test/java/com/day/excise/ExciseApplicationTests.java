package com.day.excise;

import com.day.excise.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExciseApplicationTests {

    @Autowired
    User user;
    @Test
    public void contextLoads() {
        System.out.print(user);
    }

}
