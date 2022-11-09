package liga.medical.common.core.repository;

import liga.medical.common.core.model.Debug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebugJpaRepository extends JpaRepository<Debug, String> {
    Debug save(Debug debug);
}
