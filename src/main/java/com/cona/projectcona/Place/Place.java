package com.cona.projectcona.Place;

import com.cona.projectcona.KakaoPlaceSearchSdk.Enum.PlaceCategoryCode;
import com.cona.projectcona.Review.Review;
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
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long placeId;

    private String x;

    private String y;

    private PlaceCategoryCode placeCategoryCode;

    private String categoryName;

    private String name;

    private String phone;

    private String addressName;

    private String roadAddress;

    private String placeUrl;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "place")
    List<Review> reviews = new ArrayList<>();
}
