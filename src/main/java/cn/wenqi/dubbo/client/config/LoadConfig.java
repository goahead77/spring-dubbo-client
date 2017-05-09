package cn.wenqi.dubbo.client.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wenqi
 */

@Configuration
@ComponentScan("cn.wenqi")
@Import(value = {DubboConfig.class,MvcConfig.class})
public class LoadConfig {

}
