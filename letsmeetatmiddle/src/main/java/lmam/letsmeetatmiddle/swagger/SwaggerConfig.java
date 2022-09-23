package lmam.letsmeetatmiddle.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI lmamOpenAPI() {
        return new OpenAPI()
            .info(new Info().title("우리 가운데서 만나 API 명세서")
            .version("v0.0.1"));
    }
}
