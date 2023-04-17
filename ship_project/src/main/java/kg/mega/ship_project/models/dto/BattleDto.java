package kg.mega.ship_project.models.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BattleDto {
    String name;
    Timestamp date;
}
