package com.iclimit.blog.system.repository;

import com.iclimit.blog.common.config.MyMapper;
import com.iclimit.blog.common.domain.User;

import java.util.List;

/**
 * Created by limit on 2018/08/29.
 * @author limit
 */
public interface UserMapper extends MyMapper<User> {

    User getUser();

}
