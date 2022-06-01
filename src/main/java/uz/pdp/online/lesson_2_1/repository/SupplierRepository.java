package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.online.lesson_2_1.Projection.SupplierCustom;
import uz.pdp.online.lesson_2_1.entity.Supplier;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierCustom.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
