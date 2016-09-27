package spring.demo.helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.demo.beaninheritance.VietnamHelloWorld;

/**
 * main hello word
 * Created by baonc on 9/22/16.
 */
public class MainHello {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWord objA = (HelloWord) context.getBean("helloWorld");
        System.out.println("HelloWorld: " + objA.getMessage());
        System.out.println("HelloWorld: " + objA.getMessage2());

        VietnamHelloWorld objB = (VietnamHelloWorld) context.getBean("vietnamHelloWorld");
        System.out.println("Vietnam: " + objB.getMessage());
        System.out.println("Vietnam: " + objB.getMessage2());
        System.out.println("Vietnam: " + objB.getMessage3());
    }
}
