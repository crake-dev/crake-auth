package app.crake.auth.health.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/**
 * Created by admin@crake.app on 3/24/22
 * Github : http://github.com/crake-dev
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(NON_NULL)
public class HealthDto {

    @Builder.Default
    private String data = "ok";
}
