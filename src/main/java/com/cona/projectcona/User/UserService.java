package com.cona.projectcona.User;

/**
 * 1. 회원가입 2. 로그인 3. 로그아웃 4. 회원 정보 수정 5. 회원 검색
 */
public interface UserService {
    User join();
    User login();
    User logout();
    User editUser();
    User searchUser(Long searchByNickname);
}
