package spring.demo.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main
 * Created by baonc on 9/24/16.
 */
public class MainBeanCycle {
    public static void main(String args[]) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BeansCycle beansCycle = (BeansCycle) context.getBean("beanCycle");
        System.out.println(beansCycle.getMessage());
        context.registerShutdownHook();
    }
}
