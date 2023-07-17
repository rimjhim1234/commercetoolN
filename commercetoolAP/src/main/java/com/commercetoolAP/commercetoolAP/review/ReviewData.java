package com.commercetoolAP.commercetoolAP.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewData {

    public String key;
    public String authorName;
    public String title;
    private int rating;
    public String text;

}
