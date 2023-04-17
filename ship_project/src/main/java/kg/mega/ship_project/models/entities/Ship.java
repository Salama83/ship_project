package kg.mega.ship_project.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Ships")
public class Ship {
    @Id
    String name;

    @ManyToOne
    @JoinColumn(name = "classes")
    Class classes;
    int launched;
}
