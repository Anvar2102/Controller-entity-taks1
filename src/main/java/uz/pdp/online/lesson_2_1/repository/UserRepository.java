package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.online.lesson_2_1.Projection.UserCustom;
import uz.pdp.online.lesson_2_1.entity.User;

@RepositoryRestResource(path = "user",excerptProjection = UserCustom.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
