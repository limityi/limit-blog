package com.iclimit.blog.system.service.impl;

import com.iclimit.blog.common.domain.User;
import com.iclimit.blog.common.service.impl.BaseService;
import com.iclimit.blog.system.repository.UserMapper;
import com.iclimit.blog.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by limit on 2018/08/29.
 * @author limit
 */
@Service("userService")
@Transactional
public class UserServiceImpl extends BaseService<User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String userName) {
        Example example=new Example(User.class);
        example.createCriteria().andCondition("lower(username)=",userName.toLowerCase());
        List<User> userList=this.selectByExample(example);

        if(userList.size()==0){
            return null;
        }else{
            return userList.get(0);
        }

    }

    @Override
    public void addUser(User user) {

        this.save(user);
    }

    @Override
    public User getUser() {

        return userMapper.getUser();
    }
}
