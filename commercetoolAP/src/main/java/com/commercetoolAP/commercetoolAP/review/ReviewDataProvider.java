package com.commercetoolAP.commercetoolAP.review;

import com.commercetoolAP.commercetoolAP.customer.Client;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewDraft;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReviewDataProvider {

    ProjectApiRoot apiRoot= Client.createApiClient();
   public Review createreview(ReviewDraft reviewDraft) {
       return apiRoot.reviews().post(reviewDraft).executeBlocking().getBody().get();
   }
}

