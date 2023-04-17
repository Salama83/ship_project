package kg.mega.ship_project.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Classes")
public class Class {
    @Id
    String classes;
    String type;
    String country;
    int numGuns;
    double bore;
    Integer displacement;
}
