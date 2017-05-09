package cn.wenqi.springboot.controller;

import cn.wenqi.springboot.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cn.wenqi.springboot.entity.Users;

/**
 * @author wenqi
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0.0")
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ApiResult login(String name,String pwd) throws Exception {
        Users users=userService.findByUnameAndPwd(name,pwd);
        if(users==null)
            throw new Exception("用户或密码错误");
        return new ApiResult(200,"登录成功",users);
    }


}
