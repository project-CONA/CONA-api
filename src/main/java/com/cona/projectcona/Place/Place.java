package com.cona.projectcona.Place;

import com.cona.projectcona.KakaoApiSdk.Enum.PlaceCategoryCode;
import com.cona.projectcona.Review.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Place {

    @Id @GeneratedValue
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

    @OneToMany(mappedBy = "review")
    List<Review> reviews = new ArrayList<>();
}
