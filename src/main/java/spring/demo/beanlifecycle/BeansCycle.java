package spring.demo.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Beans life cycle
 * Created by baonc on 9/24/16.
 */
public class BeansCycle implements InitializingBean, DisposableBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void destroy() throws Exception {
        System.out.println("Bean will destroy right now!");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going to through init");
    }
}
