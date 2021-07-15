package com.sofka.back.usecase;

import com.sofka.back.mappers.MovieMapper;
import com.sofka.back.models.MovieDTO;
import com.sofka.back.repositories.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class UseCaseGetByTypeMovie {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    public UseCaseGetByTypeMovie(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    public Flux<MovieDTO> getByTyMovie(String idType){

        return movieRepository.findAllByIdTipo(idType).map(movieMapper.fromMovieToMovieDTO());
    }

}
