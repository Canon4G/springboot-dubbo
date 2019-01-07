package com.canon4g.provider.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.canon4g.provider.config.RedisConfiguration;
import com.canon4g.provider.model.User;
import com.canon4g.provider.redis.UserRedis;
import com.canon4g.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

/**
 * create by Canon4G 2019-01-04
 **/
@Service
@Component
@ContextConfiguration(classes = {RedisConfiguration.class,UserRedis.class} )
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRedis userRedis;

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

    @Override
    public User getUserInfo(String loginName) {
        User user = userRedis.getUserByKey(this.getClass().getName()+":userByLoginName:"+loginName);
        Assert.notNull(user, "用户为空！");
        return user;
    }

    @Override
    public void redisInitData() {
        User user = new User();
        user.setUserName("guanhao");
        userRedis.addUser(this.getClass().getName()+":userByLoginName:"+user.getUserName(),3600L,user);
    }
}
