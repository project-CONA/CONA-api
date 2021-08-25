package com.cona.projectcona.User;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class User {
    @Id @GeneratedValue
    private Long id;

    private Long userId;

    private String nickName;

    private String shortComment;

    private String profileImg;

    private String refreshToken;

}
