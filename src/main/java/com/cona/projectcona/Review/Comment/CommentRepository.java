package com.cona.projectcona.Review.Comment;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 댓글 저장소 인터페이스
 * 기능: 1. 특정 리뷰의 댓글 조회, 2. 특정 유저의 댓글 조회
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByReviewId(Long reviewId);
    List<Comment> findAllByUserId(Long userId);
}
