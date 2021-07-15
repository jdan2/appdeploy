package com.sofka.back.router;

import com.sofka.back.models.MovieDTO;
import com.sofka.back.usecase.UseCaseGetByTypeMovie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterGetByTypeMovie {

    @Bean
    public RouterFunction<ServerResponse> suggestMovie(UseCaseGetByTypeMovie useCaseGetByTypeMovie) {
        return route(
                GET("/sugerirmovie/{typemoviee}").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseGetByTypeMovie.getByTyMovie(request.pathVariable("typemoviee")), MovieDTO.class))
        );
    }
}
