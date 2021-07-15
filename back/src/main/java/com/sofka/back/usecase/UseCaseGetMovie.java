package com.sofka.back.usecase;

import com.sofka.back.mappers.MovieMapper;
import com.sofka.back.models.MovieDTO;
import com.sofka.back.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseGetMovie {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    @Autowired
    public UseCaseGetMovie(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    public Mono<MovieDTO> getMovie(String id){
        return movieRepository.findById(id).map(movieMapper.fromMovieToMovieDTO());
    }


}
