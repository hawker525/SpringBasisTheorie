package be.vdab.services;

import be.vdab.restclients.KoersenClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Maarten Westelinck on 2/02/2017 for SpringBasisTheorie.
 */
@Configuration
public class ServicesConfig {
    @Bean
    EuroService euroService(@Qualifier("ECB") KoersenClient koersenClient) {
        return new EuroService(koersenClient);
    }
}
