package kg.mega.ship_project.repositories;

import kg.mega.ship_project.models.entities.Outcome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomeRepo extends JpaRepository<Outcome, String> {
}
