package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.online.lesson_2_1.Projection.ProductCustom;
import uz.pdp.online.lesson_2_1.entity.Product;

@RepositoryRestResource(path = "product",excerptProjection = ProductCustom.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
