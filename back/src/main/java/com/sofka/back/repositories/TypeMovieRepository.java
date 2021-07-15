package com.sofka.back.repositories;

import com.sofka.back.collections.TypeMovie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMovieRepository  extends ReactiveCrudRepository<TypeMovie, String> {
}
