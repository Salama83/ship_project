package kg.mega.ship_project.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OutcomePK implements Serializable {
    String ship;
    Battle battle;
}
