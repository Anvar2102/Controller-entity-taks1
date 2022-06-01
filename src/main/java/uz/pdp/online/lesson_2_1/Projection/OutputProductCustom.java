package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Input;
import uz.pdp.online.lesson_2_1.entity.OutputProduct;
import uz.pdp.online.lesson_2_1.entity.Product;


@Projection(types = OutputProduct.class)
public interface OutputProductCustom {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Input getOutput();
}
