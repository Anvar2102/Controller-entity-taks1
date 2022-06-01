package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.online.lesson_2_1.Projection.InputCustom;
import uz.pdp.online.lesson_2_1.entity.Input;

@RepositoryRestResource(path = "input",excerptProjection = InputCustom.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}
