package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseCustom {
    Integer getId();

    String getName();

    boolean getActive();
}
