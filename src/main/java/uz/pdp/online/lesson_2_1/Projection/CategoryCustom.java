package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Category;

@Projection(types = Category.class)
public interface CategoryCustom {
    Integer getId();

    String getName();

    boolean getActive();

    Category getParentCategory();
}
