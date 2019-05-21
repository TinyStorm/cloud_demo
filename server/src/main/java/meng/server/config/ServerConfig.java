package meng.server.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
@EnableAutoConfiguration
public class ServerConfig {

    /*

    @Bean
    @ConfigurationProperties(prefix = "serverconfig.eureka.client")//此处new 出来的东西会自动注入配置文件中的相关属性
    public EurekaClientConfigBean eurekaClientConfigBean() {

        EurekaClientConfigBean bean = new EurekaClientConfigBean();
        return bean;
    }
    */

/*
    @Bean //修改配置
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return (WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>) factory -> factory.setPort(8000);
    }

*/
}
