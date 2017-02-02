import be.vdab.*;
import be.vdab.services.EuroService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")){
            System.out.println(context.getBean(EuroService.class).naarDollar(BigDecimal.valueOf(2)));
            }
    }
}
