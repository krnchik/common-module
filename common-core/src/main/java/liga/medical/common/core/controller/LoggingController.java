package liga.medical.common.core.controller;

import liga.medical.common.core.service.LoggingService;
import liga.medical.common.dto.LogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class LoggingController {

    private final LoggingService service;

    @Autowired
    public LoggingController(LoggingService service) {
        this.service = service;
    }

    @GetMapping
    @RequestMapping("/debug")
    public ResponseEntity<String> saveDebugLog(@RequestBody LogDto logDto) {
        service.saveDebug(logDto.getSystemTypeId(), logDto.getMethodParams());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    @RequestMapping("/exception")
    public ResponseEntity<String> saveExceptionLog(@RequestBody LogDto logDto) {
        service.saveException(logDto.getSystemTypeId(), logDto.getMethodParams());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
