package meng.server.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ServerConfig {

    @Bean
    @ConfigurationProperties(prefix = "eureka.test.client")//此处new 出来的东西会自动注入配置文件中的相关属性
    public EurekaClientConfigBean getBean() {

        EurekaClientConfigBean bean = new EurekaClientConfigBean();
        return bean;
    }


}
