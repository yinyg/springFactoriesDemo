package tech.hiyinyougen.springFactoriesDemo.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * A
 * @author yinyg
 * @date 2023/4/26
 */
public class SpringFactoriesDemoBeanA implements InitializingBean {

    public static final Log log = LogFactory.getLog(SpringFactoriesDemoBeanA.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("invoke afterPropertiesSet for bean springFactoriesDemoBeanA");
    }

}
