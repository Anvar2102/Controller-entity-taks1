package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_1.Projection.OutputCustom;
import uz.pdp.online.lesson_2_1.entity.Output;

@RepositoryRestResource(path = "output",excerptProjection = OutputCustom.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
