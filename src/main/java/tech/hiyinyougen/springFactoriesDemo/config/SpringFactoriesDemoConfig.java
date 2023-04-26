package tech.hiyinyougen.springFactoriesDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.hiyinyougen.springFactoriesDemo.bean.SpringFactoriesDemoBeanA;

/**
 * MyConfig
 * @author yinyg
 * @date 2023/4/26
 */
@Configuration
public class SpringFactoriesDemoConfig {

    @Bean
    public SpringFactoriesDemoBeanA springFactoriesDemoBeanA() {
        return new SpringFactoriesDemoBeanA();
    }

}
