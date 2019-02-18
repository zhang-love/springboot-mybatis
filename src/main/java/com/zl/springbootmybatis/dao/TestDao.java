package com.zl.springbootmybatis.dao;

import com.zl.springbootmybatis.entity.Author;
import com.zl.springbootmybatis.entity.Blog;
import com.zl.springbootmybatis.entity.Test;
import com.zl.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 16:42
 */
public interface TestDao {

    User getUser(int id);

    User getUser2(User user);

    List<User> getUsers();

    Integer insertUser(User user);

    Integer insertUsers(List<User> users);

    Test test();

    List<User> selectUser();

    Blog selectBlog(Integer id);

    Author selectAuthor(Integer id);

    Integer updateUser(int id);

    Integer deleteUser(int id);

    List<User> findUser(User user);

    List<User> findUser2(User user);

    List<User> findUser3(User user);

    List<User> findUser4(User user);

    Integer updateUser2(User user);

    Integer updateUser3(User user);

    List<User> findUser5(List<Integer> ids);
}
