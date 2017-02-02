package be.vdab.restclients;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Maarten Westelinck on 2/02/2017 for SpringBasisTheorie.
 */
@Configuration
@PropertySource("classpath:restclients.properties")
public class RestClientsConfig {
    @Bean
    KoersenClient koersenClient(@Value("${yahooKoersenURL}") URL yahooURL, @Value("${ecbKoersenURL}") URL ecbURUrl){
        try (InputStream stream = yahooURL.openStream()) {
            return new YahooKoersenClient(yahooURL);
        } catch (IOException ex) {
            return new ECBKoersenClient(ecbURUrl);
        }
    }

    @Bean
    @Qualifier("ECB")
    ECBKoersenClient ecbKoersenClient(@Value("${ecbKoersenURL}") URL url) {
        return new ECBKoersenClient(url);
    }

    @Bean
    @Qualifier("Yahoo")
    YahooKoersenClient yahooKoersenClient(@Value("${yahooKoersenURL}") URL url) {
        return new YahooKoersenClient(url);
    }

}
