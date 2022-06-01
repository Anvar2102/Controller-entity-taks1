package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_1.Projection.CurrencyCustom;
import uz.pdp.online.lesson_2_1.entity.Currency;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyCustom.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

}
