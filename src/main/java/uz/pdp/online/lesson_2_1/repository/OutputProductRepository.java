package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.online.lesson_2_1.Projection.OutputProductCustom;
import uz.pdp.online.lesson_2_1.entity.OutputProduct;

@RepositoryRestResource(path = "outputProduct",excerptProjection = OutputProductCustom.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
