package com.cona.projectcona.Review;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 회원 저장소 인터페이스
 * 기능: 1. 특정 유저의 리뷰 리스트 조회
 */
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Page<Review> findAllByUserId(Long userId, Pageable pageable);
}
