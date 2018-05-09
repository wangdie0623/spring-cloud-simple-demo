package com.wang.springboot.faceapi.feign;

import com.wang.springboot.cloudbeans.ResultInfo;
import com.wang.springboot.cloudbeans.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("admin")
@RequestMapping("/rest/users")
public interface AdminFeign {
    @GetMapping
    public ResultInfo userDetail();

    @GetMapping("{pageNum}/{pageSize}")
    public ResultInfo userList(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize);

    @PostMapping
    public ResultInfo save(@RequestBody User user);

    @PutMapping
    public ResultInfo edit(@RequestBody User user);

    @DeleteMapping
    public ResultInfo destroy(Integer id);
}
