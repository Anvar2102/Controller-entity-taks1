package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.online.lesson_2_1.Projection.ClientCustom;
import uz.pdp.online.lesson_2_1.entity.Client;

@RepositoryRestResource(path = "client",excerptProjection = ClientCustom.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
