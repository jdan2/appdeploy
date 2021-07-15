package com.sofka.back.mappers;

import com.sofka.back.collections.Movie;
import com.sofka.back.models.MovieDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MovieMapper {


    public Function<MovieDTO, Movie> fromMovieDtoToMovie(String id){
        return updateMovie->{
            var movie =new Movie();
            movie.setId(id);
            movie.setNombre(updateMovie.getNombre());
            movie.setDuracion(updateMovie.getDuracion());
            movie.setLink(updateMovie.getLink());
            movie.setIdTipo(updateMovie.getIdTipo());
            return movie;
        };

    }

    public Function<Movie,MovieDTO> fromMovieToMovieDTO(){
        return entity->
                new MovieDTO(
                        entity.getId(),
                        entity.getNombre(),
                        entity.getDuracion(),
                        entity.getLink(),
                        entity.getIdTipo()
                );

    }
}
