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
        HelloWord helloWord = (HelloWord) context.getBean("hello world");
        System.out.println(helloWord.getMessage());
    }
}
