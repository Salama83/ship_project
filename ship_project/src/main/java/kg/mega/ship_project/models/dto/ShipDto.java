package kg.mega.ship_project.models.dto;

import kg.mega.ship_project.models.entities.Class;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShipDto {
    String name;
    Class classes;
    int launched;
}
