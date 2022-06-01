package uz.pdp.online.lesson_2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_1.Projection.AttachmentCustom;
import uz.pdp.online.lesson_2_1.entity.Attachment;

@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentCustom.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
