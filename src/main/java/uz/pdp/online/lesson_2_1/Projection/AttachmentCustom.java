package uz.pdp.online.lesson_2_1.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_1.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentCustom {
    Integer getId();

    String getName();

    long getSize();

    String getContentType();
}
