package com.sofka.back.mappers;

import com.sofka.back.collections.TypeMovie;
import com.sofka.back.models.TypeMovieDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class TypeMovieMapper {

    public Function<TypeMovieDTO, TypeMovie> fromTypeMovieDtoToTypeMovie(String id){
        return updateTypeMovie->{
            var typeMovie =new TypeMovie();
            typeMovie.setId(id);
            typeMovie.setNombre(updateTypeMovie.getNombre());
            return typeMovie;
        };

    }

    public Function<TypeMovie,TypeMovieDTO> fromTypeMovieToTypeMovieDTO(){
        return entity->
                new TypeMovieDTO(
                        entity.getId(),
                        entity.getNombre()
                );

    }
}
