package com.wang.springboot.admin.Controller.restful;

import com.wang.springboot.admin.model.service.IUserService;
import com.wang.springboot.cloudbeans.ResultInfo;
import com.wang.springboot.cloudbeans.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/rest/users")
public class UserRestApi {
    @Resource
    private IUserService userService;

    @GetMapping
    public ResultInfo userDetail() {
        return ResultInfo.ok("查询所有用户", userService.selectAll());
    }

    @GetMapping("{pageNum}/{pageSize}")
    public ResultInfo userList(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        return ResultInfo.ok("查询分页", userService.selectByPage(pageNum, pageSize));
    }

    @PostMapping
    public ResultInfo save(@RequestBody User user) {
        userService.save(user);
        return ResultInfo.ok("保存成功");
    }

    @PutMapping
    public ResultInfo edit(@RequestBody User user) {
        userService.edit(user);
        return ResultInfo.ok("编辑成功");
    }

    @DeleteMapping
    public ResultInfo destroy(Integer id) {
        userService.destroy(id);
        return ResultInfo.ok("注销成功");
    }
}
