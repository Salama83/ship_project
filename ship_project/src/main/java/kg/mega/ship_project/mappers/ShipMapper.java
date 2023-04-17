package kg.mega.ship_project.mappers;

import kg.mega.ship_project.models.dto.ShipDto;
import kg.mega.ship_project.models.entities.Ship;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ShipMapper {
    ShipMapper INSTANCE = Mappers.getMapper(ShipMapper.class);
    Ship shipDtoToShip(ShipDto shipDto);
    ShipDto shipToShipDto(Ship ship);
}
