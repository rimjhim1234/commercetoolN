package com.commercetoolAP.commercetoolAP.review;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.CustomerPagedQueryResponse;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewPagedQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;

@RestController
public class ReviewController {
    @Autowired
    ProjectApiRoot apiRoot;
    @Autowired
    ReviewService reviewService;
//   @GetMapping("/getallreview")
//   public ReviewPagedQueryResponse getallreviewproduct(){
//        ReviewPagedQueryResponse review = apiRoot
//               .reviews()
//               .get()
//               .withSort("rating desc")
//               .executeBlocking()
//               .getBody();
//       return review;
    @GetMapping("/getallreview")
    public ReviewPagedQueryResponse getallreviewproduct(@RequestParam  String sort ){
       return apiRoot.reviews().get().addSort(sort).executeBlocking().getBody();
    }
    @GetMapping("/review/{id}")
    public Review getreviewbyid(@PathVariable String id){
        return apiRoot.reviews().withId(id).get().executeBlocking().getBody();
    }
    @PostMapping("/review")
     public Review createreview(@RequestBody ReviewData reviewData) {
       return reviewService.createreview(reviewData);
   }
}

