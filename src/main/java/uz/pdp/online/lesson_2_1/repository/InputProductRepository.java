package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_1.Projection.InputProductCustom;
import uz.pdp.online.lesson_2_1.entity.InputProduct;

@RepositoryRestResource(path = "inputProduct",excerptProjection = InputProductCustom.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
