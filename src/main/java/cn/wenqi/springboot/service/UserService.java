package cn.wenqi.springboot.service;


import cn.wenqi.dubbo.client.entity.Users;

/**
 * @author wenqi
 */
public interface UserService {

    Users findByUnameAndPwd(String uName, String pwd);
}
