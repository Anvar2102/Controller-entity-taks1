package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyCustom {
    Integer getId();

    String getName();

    boolean getActive();
}
