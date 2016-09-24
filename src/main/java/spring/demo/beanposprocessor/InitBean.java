package spring.demo.beanposprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Init bean cycle
 * Created by baonc on 9/24/16.
 */
public class InitBean implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Before init: " + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("After init: " + s);
        return o;
    }
}
