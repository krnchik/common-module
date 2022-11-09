package liga.medical.common.core.repository;

import liga.medical.common.core.model.Exception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExceptionJpaRepository extends JpaRepository<Exception, String> {
    Exception save(Exception e);
}
