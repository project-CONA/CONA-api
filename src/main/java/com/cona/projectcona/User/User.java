package com.cona.projectcona.User;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.Review.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id @GeneratedValue
    private Long id;

    private Long userId;

    private String nickName;

    private String shortComment;

    private String profileImg;

    private String refreshToken;

    @OneToMany(mappedBy = "place")
    private List<Place> pinPlaces;

    private LocalDateTime signedAt;

    @OneToMany(mappedBy = "user")
    List<User> followers = new ArrayList<>();

    @OneToMany(mappedBy ="user")
    List<User> following = new ArrayList<>();

    @OneToMany(mappedBy = "review")
    List<Review> reviews = new ArrayList<>();
}
