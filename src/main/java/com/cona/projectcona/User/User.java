package com.cona.projectcona.User;

import com.cona.projectcona.Follow.Follow;
import com.cona.projectcona.Place.Place;
import com.cona.projectcona.UserPlace.PinPlace.PinPlace;
import com.cona.projectcona.UserPlace.Review.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String nickName;

    private String shortComment;

    private String profileImg;

    @OneToMany(mappedBy = "user")
    private List<PinPlace> pinPlaces = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();

    private LocalDateTime signedAt;

    @OneToMany(mappedBy = "follower", targetEntity = Follow.class)
    private List<User> followers = new ArrayList<>();

    @OneToMany(mappedBy ="following", targetEntity = Follow.class)
    private List<User> following = new ArrayList<>();
}
