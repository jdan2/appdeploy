package com.sofka.back.repositories;

import com.sofka.back.collections.Movie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MovieRepository  extends ReactiveCrudRepository<Movie, String> {

}
