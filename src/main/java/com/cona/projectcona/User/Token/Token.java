package com.cona.projectcona.User.Token;

import com.cona.projectcona.User.User;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private String accessToken;

    private String refreshToken;

    public static Long addToken(User user, String kakaoAcessToken, String kakaoRefreshToken) {
        Token token = new Token();
        //TODO 토큰 정보 save
        return token.getId();
    }

    public Long regenerateToken(User user, String kakaoAccessToken) {
        //TODO 카카오 인증 서버로 부터 재발급 받은 액세스 토큰 저장
        return null;
    }

    public Long expireToken() {
        //TODO 토큰 정보 삭제
        return null;
    }
}
