package uz.pdp.online.lesson_2_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.online.lesson_2_1.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier extends AbsEntity {
    @Column(nullable = false, unique = true)
    private String phoneNumber;
}