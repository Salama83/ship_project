package kg.mega.ship_project.repositories;

import kg.mega.ship_project.models.entities.Battle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleRepo extends JpaRepository<Battle, String> {
}
