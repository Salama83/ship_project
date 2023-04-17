package kg.mega.ship_project.mappers;

import kg.mega.ship_project.models.dto.BattleDto;
import kg.mega.ship_project.models.entities.Battle;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface BattleMapper {
    BattleMapper INSTANCE = Mappers.getMapper(BattleMapper.class);
    Battle battleDtoToBattle(BattleDto battleDto);
    BattleDto battleToBattleDto(Battle battle);
}
