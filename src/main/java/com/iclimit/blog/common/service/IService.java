package com.iclimit.blog.common.service;

import java.util.List;

/**
 * Created by limit on 2018/08/29.
 * @author limit
 */
public interface IService<T> {
    List<T> selectAll();

    T selectByKey(Object key);

    public List<T> selectByExample(Object example);

    void save(T entity);

}
