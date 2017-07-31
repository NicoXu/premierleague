package com.shaw.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by shaw on 2017/7/17.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
