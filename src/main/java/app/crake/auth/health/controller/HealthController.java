package app.crake.auth.health.controller;

import app.crake.auth.health.dto.HealthDto;
import app.crake.auth.health.service.HealthService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by admin@crake.app on 3/24/22
 * Github : http://github.com/crake-dev
 */
@Validated
@RestController
@RequiredArgsConstructor
public class HealthController {

    private final HealthService service;

    @GetMapping("/healthcheck")
    public Mono<HealthDto> checkToken() {
        return service.healthCheck();
    }
}
