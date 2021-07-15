package com.sofka.back.router;

import com.sofka.back.models.MovieDTO;
import com.sofka.back.usecase.UseCaseGetMovie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterGetMovie {

    @Bean
    public RouterFunction<ServerResponse> getById(UseCaseGetMovie useCaseGetMovie) {
        return route(
                GET("/consultarmovie/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .body(useCaseGetMovie.getMovie(request.pathVariable("id")), MovieDTO.class)
        );
    }
}
