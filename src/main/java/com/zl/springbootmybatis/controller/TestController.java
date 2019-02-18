package com.zl.springbootmybatis.controller;

import com.zl.springbootmybatis.dao.TestDao;
import com.zl.springbootmybatis.entity.Author;
import com.zl.springbootmybatis.entity.Blog;
import com.zl.springbootmybatis.entity.Test;
import com.zl.springbootmybatis.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 16:51
 */
@RestController
public class TestController {

    @Resource
    TestDao testDao;

    @RequestMapping("/getUser")
    public List<User> getUser(@RequestParam("id") Integer id){
        User user = new User();
        user.setUsername("user");
        user.setPassword("user");

        return testDao.getUsers();
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        return testDao.getUsers();
    }

    @RequestMapping("/insertUser")
    public Integer insertUser(@RequestBody User user){
        return testDao.insertUser(user);
    }

    @RequestMapping("/insertUsers")
    public Integer insertUsers(@RequestBody List<User> users){return testDao.insertUsers(users);}

    @RequestMapping("/updateUser")
    public Integer updateUser(@RequestParam Integer id){
        return testDao.updateUser(id);
    }

    @RequestMapping("/deleteUser")
    public Integer deleteUser(@RequestParam Integer id){
        return testDao.deleteUser(id);
    }
    @RequestMapping("/test")
    public Test test(){
        return testDao.test();
    }

    @RequestMapping("/selectUser")
    public List<User> selectUser(){
        return testDao.selectUser();
    }

    @RequestMapping("/selectBlog")
    public Blog selectBlog(@RequestParam("id") Integer id){
        return testDao.selectBlog(id);
    }

    @RequestMapping("/selectAuthor")
    public Author selectAuthor(@RequestParam("id") Integer id){
        return testDao.selectAuthor(id);
    }

    @RequestMapping("/findUser")
    public List<User> findUser(@RequestBody User user){
        return testDao.findUser(user);
    }

    @RequestMapping("/findUser2")
    public List<User> findUser2(@RequestBody User user){
        return testDao.findUser2(user);
    }

    @RequestMapping("/findUser3")
    public List<User> findUser3(@RequestBody User user){
        return testDao.findUser3(user);
    }

    @RequestMapping("/findUser4")
    public List<User> findUser4(@RequestBody User user){
        return testDao.findUser4(user);
    }

    @RequestMapping("/updateUser2")
    public Integer updateUser2(@RequestBody User user){
        return testDao.updateUser2(user);
    }

    @RequestMapping("/updateUser3")
    public Integer updateUser3(@RequestBody User user){
        return testDao.updateUser3(user);
    }

    @RequestMapping("/findUser5")
    public List<User> findUser5(){
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        return testDao.findUser5(ids);
    }
}
