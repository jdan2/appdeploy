package com.sofka.back.router;

import com.sofka.back.models.MovieDTO;
import com.sofka.back.usecase.UseCaseCreateMovie;
import com.sofka.back.usecase.UseCaseGetAllMovie;
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
public class RouterGetAllMovie {

    @Bean
    public RouterFunction<ServerResponse> getAllMovie(UseCaseGetAllMovie useCaseGetAllMovie) {
        return route(
                GET("/consultarmovies").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseGetAllMovie.getAllMovie(), MovieDTO.class))
        );
    }
}
