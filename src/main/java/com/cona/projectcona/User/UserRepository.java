package com.cona.projectcona.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * 회원 저장소 인터페이스
 * 1. 회원 저장 2. 회원 정보 수정 3. 아이디로 조회 4. 닉네임으로 조회
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long userId);
    Optional<User> findByNickName(String nickName);
}
