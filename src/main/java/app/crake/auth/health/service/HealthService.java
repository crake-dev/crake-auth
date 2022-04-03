package app.crake.auth.health.service;

import app.crake.auth.health.dto.HealthDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Created by admin@crake.app on 3/24/22
 * Github : http://github.com/crake-dev
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class HealthService {

    public Mono<HealthDto> healthCheck() {
        return Mono.just(HealthDto.builder().build());
    }
}
