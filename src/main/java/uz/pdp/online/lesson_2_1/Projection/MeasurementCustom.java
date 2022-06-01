package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementCustom {
    Integer getId();

    String getName();

    boolean getActive();
}
