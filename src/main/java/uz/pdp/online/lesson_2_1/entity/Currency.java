package uz.pdp.online.lesson_2_1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.online.lesson_2_1.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbsEntity {

}
