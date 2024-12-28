package com.materi.java.controller;

import com.materi.java.service.UserService;
import com.materi.java.exception.CommonResponse;
import com.materi.java.exception.ResponseHelper;
import com.materi.java.model.LoginRequest;
import com.materi.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public CommonResponse<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        return ResponseHelper.ok( userService.login(loginRequest));
    }
    @PostMapping("/register")
    public CommonResponse<User> register(@RequestBody User user){
        return ResponseHelper.ok( userService.add(user));
    }

    @GetMapping("/{id}")
    public CommonResponse <User> get(@PathVariable("id") Long id){
        return ResponseHelper.ok( userService.get(id));
    }
    @GetMapping
    public CommonResponse<List<User>> getAll(){
        return ResponseHelper.ok( userService.getAll());
    }
    @PutMapping("/{id}")
    public CommonResponse<User> put(@PathVariable("id") Long id , @RequestBody User user){
        return ResponseHelper.ok( userService.edit(id, user));
    }
    @DeleteMapping("/{id}")
    public CommonResponse<?> delete(@PathVariable("id")  Long id ) {
        return ResponseHelper.ok( userService.delete(id));
    }
}