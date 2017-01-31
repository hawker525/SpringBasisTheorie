package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")){
            System.out.println(context.getBean(ClassA.class).getBoodschap());
            System.out.println(context.getBean(InterfaceB.class).getBoodschap());
        }
    }
}
