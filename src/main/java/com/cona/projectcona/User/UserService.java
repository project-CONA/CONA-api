package com.cona.projectcona.User;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 1. 회원가입 2. 로그인 3. 로그아웃 4. 회원 정보 수정 5. 회원 검색
 */
public interface UserService extends UserDetailsService {
    public User join();
    public User login();
    public User logout();
    public User editUser();
    public  User searchUser(Long searchByNickname);
    public User followUser(Long followerId, Long followingId);
}
