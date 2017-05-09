package cn.wenqi.springboot.service;


import cn.wenqi.springboot.entity.Users;

/**
 * @author wenqi
 */
public interface UserService {

    Users findByUnameAndPwd(String uName, String pwd);

    //interface=cn.wenqi.springboot.service.UserService
    //interface=cn.wenqi.springboot.service.UserService
}
