package com.sofka.back.usecase;

import com.sofka.back.mappers.TypeMovieMapper;
import com.sofka.back.models.MovieDTO;
import com.sofka.back.models.TypeMovieDTO;
import com.sofka.back.repositories.TypeMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreateType {

    private final TypeMovieRepository typeMovieRepository;
    private final TypeMovieMapper typeMovieMapper;

    @Autowired
    public UseCaseCreateType(TypeMovieRepository typeMovieRepository, TypeMovieMapper typeMovieMapper) {
        this.typeMovieRepository = typeMovieRepository;
        this.typeMovieMapper = typeMovieMapper;
    }

    public Mono<TypeMovieDTO> createType (TypeMovieDTO typeMovieDTO){
        return typeMovieRepository.save(typeMovieMapper.fromTypeMovieDtoToTypeMovie(null).apply(typeMovieDTO)).map(typeMovie -> typeMovieDTO);
    }

}
