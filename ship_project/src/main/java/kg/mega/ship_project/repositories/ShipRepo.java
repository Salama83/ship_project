package kg.mega.ship_project.repositories;

import kg.mega.ship_project.models.entities.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepo extends JpaRepository<Ship, String> {

}
