package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.online.lesson_2_1.Projection.WarehouseCustom;
import uz.pdp.online.lesson_2_1.entity.Warehouse;

@RepositoryRestResource(path = "warehouse",excerptProjection = WarehouseCustom.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
