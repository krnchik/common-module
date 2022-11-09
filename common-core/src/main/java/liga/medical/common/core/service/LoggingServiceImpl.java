package liga.medical.common.core.service;

import liga.medical.common.core.model.Debug;
import liga.medical.common.core.model.Exception;
import liga.medical.common.core.repository.DebugJpaRepository;
import liga.medical.common.core.repository.ExceptionJpaRepository;
import liga.medical.common.dto.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoggingServiceImpl implements LoggingService {

    private final DebugJpaRepository debugRepository;

    private final ExceptionJpaRepository exceptionRepository;

    @Autowired
    public LoggingServiceImpl(DebugJpaRepository debugRepository, ExceptionJpaRepository exceptionRepository) {
        this.debugRepository = debugRepository;
        this.exceptionRepository = exceptionRepository;
    }

    public void saveDebug(Status status, String methodParams) {
        String id = UUID.randomUUID().toString();
        debugRepository.save(new Debug(id, status, methodParams));
    }

    public void saveException(Status status, String methodParams) {
        String id = UUID.randomUUID().toString();
        exceptionRepository.save(new Exception(id, status, methodParams));
    }
}
