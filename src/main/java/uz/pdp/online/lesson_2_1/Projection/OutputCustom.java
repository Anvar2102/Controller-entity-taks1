package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.*;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputCustom {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
