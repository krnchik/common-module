package liga.medical.common.core.service;

import liga.medical.common.dto.Status;

public interface LoggingService {

    void saveDebug(Status status, String methodParams);

    void saveException(Status status, String methodParams);
}
