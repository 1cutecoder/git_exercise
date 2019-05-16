package cute.coder.service.impl;

import cute.coder.mapper.UserMapper;
import cute.coder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cute coder
 * 2019/5/15 17:04
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean login(String username, String password) {
        return userMapper.queryUserByUsernameAndPassword(username,password)!=null;
    }
}
