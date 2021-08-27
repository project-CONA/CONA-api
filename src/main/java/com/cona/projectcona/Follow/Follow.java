package com.cona.projectcona.Follow;

import com.cona.projectcona.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Follow {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "following")
    User following;

    @ManyToOne
    @JoinColumn(name = "follower")
    User follower;

}
