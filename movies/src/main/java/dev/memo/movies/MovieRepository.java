package dev.memo.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //MongoRepository<Movie, ObjectId> - Movie is the type of Data we are dealing with
    //                                     while ObjectId is the id type we are dealing with
    Optional<Movie> findMovieByImdbId(String imdbId); // Automated generated
}
