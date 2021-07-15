package com.sofka.back.router;

import com.sofka.back.models.MovieDTO;
import com.sofka.back.models.TypeMovieDTO;
import com.sofka.back.usecase.UseCaseCreateMovie;
import com.sofka.back.usecase.UseCaseCreateType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterCreateType {

    @Bean
    public RouterFunction<ServerResponse> crearType(UseCaseCreateType useCaseCreateType) {
        return route(POST("/createtype").and(accept(MediaType.APPLICATION_JSON)),//uso json
                request -> request.bodyToMono(TypeMovieDTO.class)
                        .flatMap(typeMovieDTO -> useCaseCreateType.createType(typeMovieDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)//tipo respuesta texto plano o json
                                        .bodyValue(result))
                        )
        );
    }
}
