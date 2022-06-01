package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Input;
import uz.pdp.online.lesson_2_1.entity.InputProduct;
import uz.pdp.online.lesson_2_1.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductCustom {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
