package com.cona.projectcona.Review;

import com.cona.projectcona.Image.Image;
import com.cona.projectcona.Image.ReviewImage;
import com.cona.projectcona.Place.Place;
import com.cona.projectcona.Review.Comment.Comment;
import com.cona.projectcona.User.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;

    private String content;

    @OneToMany(mappedBy = "review")
    private List<ReviewImage> reviewImages = new ArrayList<>();

    @OneToMany(mappedBy = "review")
    private List<Comment> comments = new ArrayList<>();

    private Float score;

    private LocalDateTime createdAt;
}
