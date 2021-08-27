package com.cona.projectcona.Follow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// TODO: 팔로우 관계 찾기, 언팔로우하기
@Repository
public interface FollowRepository  extends JpaRepository<Follow, Long> {
}
