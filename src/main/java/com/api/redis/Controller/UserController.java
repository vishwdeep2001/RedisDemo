package com.api.redis.Controller;

import com.api.redis.Dao.UserDao;
import com.api.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
    private UserDao userDao;

//create User
    @PostMapping
    public User createUser(@RequestBody User user){
        user.setUserId(UUID.randomUUID().toString());
        return userDao.save(user);
    }
    //return single user
    @RequestMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId){
    return userDao.getUser(userId);
    }

    @GetMapping
    public Map<Object,Object> getAll(){
        return userDao.findAll();
    }

    //delete user
    @DeleteMapping("/{userId}")
    public  void deleteUser(@PathVariable("userId") String userId){
userDao.delete(userId);
    }
}
