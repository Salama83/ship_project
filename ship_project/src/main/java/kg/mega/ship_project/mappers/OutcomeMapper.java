package kg.mega.ship_project.mappers;

import kg.mega.ship_project.models.dto.OutcomeDto;
import kg.mega.ship_project.models.entities.Outcome;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface OutcomeMapper {
    OutcomeMapper INSTANCE = Mappers.getMapper(OutcomeMapper.class);
    Outcome outcomeDtoToOutcome(OutcomeDto outcomeDto);
    OutcomeDto outcomeToOutcomeDto(Outcome outcome);
}
