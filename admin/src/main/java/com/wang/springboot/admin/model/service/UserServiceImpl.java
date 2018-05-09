package com.wang.springboot.admin.model.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wang.springboot.admin.model.dao.UserMapper;
import com.wang.springboot.cloudbeans.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void destroy(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public void edit(User user) {
        userMapper.update(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public PageInfo selectByPage(Integer pageNum, Integer pageSize) {
        log.info("分页查询：{}页，每页{}条记录", pageNum, pageSize);
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }
}
