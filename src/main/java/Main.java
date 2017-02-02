import be.vdab.*;
import be.vdab.gaming.Spelletje;
import be.vdab.restclients.RestClientsConfig;
import be.vdab.services.EuroService;
import be.vdab.services.ServicesConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")){
            System.out.println(context.getBean(Spelletje.class).getAantalVijanden());
            }
    }
}
