package com.example.spring.start.controller;

import com.example.spring.start.domain.User;
import com.example.spring.start.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserRepository userRepository;

    /**
     * 获取用户列表
     * @return
     */
    @GetMapping
    public List<User> getUser(){
        return userRepository.listUser();
    }

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id")Long id){
        return userRepository.getUserById(id);
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.saveOrUpdateUser(user);
    }

    /**
     * 修改用户
     * @param id
     * @param user
     */
    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") Long id, @RequestBody User user){
        User oldUser = this.getUser(id);
        if (oldUser!= null){
          user.setId(id);
          userRepository.saveOrUpdateUser(user);
        }
    }

    /**
     * 删除用户
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userRepository.deleteUser(id);
    }



}
