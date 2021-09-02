package com.cona.projectcona.UserPlace.Review;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;
import com.cona.projectcona.UserPlace.UserPlace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@DiscriminatorValue("review")
@AllArgsConstructor
@NoArgsConstructor
public class Review extends UserPlace {

    private String content;

    private float score;

    //TODO: 이미지 리스트

}
