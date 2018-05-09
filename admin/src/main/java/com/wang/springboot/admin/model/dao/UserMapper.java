package com.wang.springboot.admin.model.dao;

import com.wang.springboot.cloudbeans.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectAll();

    void  insert(User user);

    void  update(User user);

    void  delete(Integer id);
}
