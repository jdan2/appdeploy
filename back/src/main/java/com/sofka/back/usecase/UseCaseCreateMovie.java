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
public class UseCaseCreateMovie {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    @Autowired
    public UseCaseCreateMovie(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    public Mono<MovieDTO> createMovie (MovieDTO movieDTO){
        return movieRepository.save(movieMapper.fromMovieDtoToMovie(null).apply(movieDTO)).map(movie -> movieDTO);
    }
}
