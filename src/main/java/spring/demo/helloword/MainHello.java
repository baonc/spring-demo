package spring.demo.helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * main hello word
 * Created by baonc on 9/22/16.
 */
public class MainHello {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWord objA = (HelloWord) context.getBean("helloWorld");
        objA.setMessage("Hi ! Iam obj A");
        System.out.println(objA.getMessage());

        HelloWord objB = (HelloWord) context.getBean("helloWorld");
        System.out.println(objB.getMessage());
    }
}
