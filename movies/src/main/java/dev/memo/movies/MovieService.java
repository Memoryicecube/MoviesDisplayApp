package dev.memo.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // we want framework to instantiate this class for us
    private MovieRepository movieRepository; // Have to declare this because you will need reference
                                             // to the repository
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){ // optional means may not find the movie and will
                                                    // return null
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
