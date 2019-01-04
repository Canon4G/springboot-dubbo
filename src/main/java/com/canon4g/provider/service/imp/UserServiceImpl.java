package com.canon4g.provider.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.canon4g.provider.model.User;
import com.canon4g.provider.service.UserService;
import org.springframework.stereotype.Component;

/**
 * create by Canon4G 2019-01-04
 **/
@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
