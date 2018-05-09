package com.wang.springboot.admin.model.service;

import com.github.pagehelper.PageInfo;
import com.wang.springboot.cloudbeans.User;

import java.util.List;

public interface IUserService {

    void destroy(Integer id);

    void save(User user);

    void edit(User user);

    List<User> selectAll();

    PageInfo selectByPage(Integer pageNum, Integer pageSize);


}
