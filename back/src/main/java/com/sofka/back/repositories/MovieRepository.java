package com.sofka.back.repositories;

import com.sofka.back.collections.Movie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MovieRepository  extends ReactiveCrudRepository<Movie, String> {

    Flux<Movie> findAllByIdTipo(String idType);

}
