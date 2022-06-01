package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.User;
import uz.pdp.online.lesson_2_1.entity.Warehouse;

import java.util.List;

@Projection(types = User.class)
public interface UserCustom {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();

    List<Warehouse> getWarehouses();

}
