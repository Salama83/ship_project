package kg.mega.ship_project.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@IdClass(OutcomePK.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Outcomes")
public class Outcome {
    @Id
    String ship;

    @Id
    @ManyToOne
    @JoinColumn(name = "name")
    Battle battle;
    String result;
}
