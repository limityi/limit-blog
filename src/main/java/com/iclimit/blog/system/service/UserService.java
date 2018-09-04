package com.iclimit.blog.system.service;

import com.iclimit.blog.common.domain.User;
import com.iclimit.blog.common.service.IService;
import com.iclimit.blog.common.service.impl.BaseService;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by XiongYi on 2018/08/29
 * @author limit
 */
public interface UserService extends IService<User> {

    User findByName(String userName);

    void addUser(User user);

    User getUser();
}
