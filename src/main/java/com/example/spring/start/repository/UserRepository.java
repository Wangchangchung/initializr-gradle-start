package com.example.spring.start.repository;

import com.example.spring.start.domain.User;

import java.util.List;

public interface UserRepository {

    /**
     * 新增或修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有用户的列表
     * @return
     */
    List<User> listUser();

}
