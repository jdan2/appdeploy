package com.sofka.back.router;

import com.sofka.back.models.MovieDTO;
import com.sofka.back.usecase.UseCaseCreateMovie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterCreateMovie {

    @Bean
    public RouterFunction<ServerResponse> crearMovie(UseCaseCreateMovie useCaseCreateMovie) {
        return route(POST("/createmovie").and(accept(MediaType.APPLICATION_JSON)),//uso json
                request -> request.bodyToMono(MovieDTO.class)
                        .flatMap(movieDTO -> useCaseCreateMovie.createMovie(movieDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)//tipo respuesta texto plano o json
                                        .bodyValue(result))
                        )
        );
    }

}
