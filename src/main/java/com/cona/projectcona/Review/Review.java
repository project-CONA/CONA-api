package com.cona.projectcona.Review;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id @GeneratedValue
    private Long id;

    private String content;

    //TODO: 이미지 리스트

    @ManyToOne(fetch = FetchType.LAZY)
    private User user; //작성자

    @ManyToOne(fetch = FetchType.LAZY)
    private Place place;

    private LocalDateTime createdAt;





}
