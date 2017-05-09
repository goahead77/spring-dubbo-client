package cn.wenqi.dubbo.client.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author wenqi
 */

@Setter
@Getter
@AllArgsConstructor
public class Users implements Serializable {

    private static final long serialVersionUID = 9221111504771052659L;
    private String uName;

    private String password;

}
