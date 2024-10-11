package org.example.Service;

import org.example.models.Review;
import org.example.model.ReviewResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ReviewService {

    public ReviewResponse getReviews() {
        // Hardcoding the response object instead of making an API call
        ReviewResponse response = new ReviewResponse();

        // Hardcoding the total count of reviews
        response.setReviews_count(100);

        // Creating and hardcoding individual reviews
        Review review1 = new Review();
        review1.setTitle("Amazing product!");
        review1.setBody("This product exceeded my expectations. Highly recommend!");
        review1.setRating(5);
        review1.setReviewer("John Doe");

        Review review2 = new Review();
        review2.setTitle("Good, but could be better");
        review2.setBody("The product works well but lacks some features.");
        review2.setRating(3);
        review2.setReviewer("Jane Smith");

        // Adding hardcoded reviews to the response
        response.setReviews(Arrays.asList(review1, review2));

        // Returning the hardcoded response
        return response;
    }
}
