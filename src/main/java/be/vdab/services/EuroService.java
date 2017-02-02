package be.vdab.services;

import be.vdab.restclients.KoersenClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
@Service
public class EuroService {
    private final KoersenClient koersenClient;

    public EuroService(KoersenClient koersenClient) {
        this.koersenClient = koersenClient;
    }

    public BigDecimal naarDollar(BigDecimal euro) {
        System.out.println(koersenClient.getClass());
        return euro.multiply(koersenClient.getDollarKoers()).setScale(2, RoundingMode.HALF_UP);
    }
}
