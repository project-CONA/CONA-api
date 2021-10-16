package com.cona.projectcona.User;

import com.cona.projectcona.Follow.Follow;
import com.cona.projectcona.Image.Image;
import com.cona.projectcona.Image.ProfileImage;
import com.cona.projectcona.PinPlace.PinPlace;
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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String nickName;

    private String shortComment;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ProfileImage profileImage;

    private LocalDateTime signedAt;
}
