package top.novashen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.novashen.pojo.User;

@Configuration
public class ApplicationContext {
    @Bean
    public User user(){
        return new User();
    }
}
