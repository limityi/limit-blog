package com.iclimit.blog.common.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by limit on 2018/08/29.
 * @author limit
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
