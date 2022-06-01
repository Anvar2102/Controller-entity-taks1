package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Currency;
import uz.pdp.online.lesson_2_1.entity.Input;
import uz.pdp.online.lesson_2_1.entity.Supplier;
import uz.pdp.online.lesson_2_1.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputCustom {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
