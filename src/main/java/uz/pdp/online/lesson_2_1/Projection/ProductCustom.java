package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Attachment;
import uz.pdp.online.lesson_2_1.entity.Category;
import uz.pdp.online.lesson_2_1.entity.Measurement;
import uz.pdp.online.lesson_2_1.entity.Product;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();

    String getName();

    boolean getActive();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}
