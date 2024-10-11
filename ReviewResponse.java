package org.example.model;

import org.example.models.Review;

import java.util.List;

public class ReviewResponse {
    private int reviews_count;
    private List<Review> reviews;

    // Getters and Setters
    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
