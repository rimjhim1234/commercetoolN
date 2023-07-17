package com.commercetoolAP.commercetoolAP.review;

import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewDraft;
import com.commercetools.api.models.review.ReviewPagedQueryResponse;
import org.springframework.stereotype.Service;

import javax.management.Query;

@Service
public class ReviewService {
    ReviewDataProvider obc=new ReviewDataProvider();

    public Review createreview(ReviewData reviewData) {
       ReviewDraft reviewDraft=ReviewDraft
              .builder()
               .key(reviewData.getKey())
               .authorName(reviewData.getAuthorName())
              .rating(reviewData.getRating())
               .title(reviewData.getTitle())
                .text(reviewData.getText())
                .build();
       return obc.createreview(reviewDraft);
  }
}
