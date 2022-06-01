package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierCustom {
    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();
}
