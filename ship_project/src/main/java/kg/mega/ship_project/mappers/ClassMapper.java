package kg.mega.ship_project.mappers;

import kg.mega.ship_project.models.dto.ClassDto;
import kg.mega.ship_project.models.entities.Class;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);
    Class classDtoToClass(ClassDto classDto);
    ClassDto classToClassDto(Class classes);
}
