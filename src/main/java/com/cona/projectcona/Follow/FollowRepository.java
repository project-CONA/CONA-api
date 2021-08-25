package com.cona.projectcona.Follow;

import com.cona.projectcona.PinPlace.PinPlace;
import org.springframework.data.jpa.repository.JpaRepository;

// TODO: 팔로우 관계 찾기, 언팔로우하기
public interface FollowRepository  extends JpaRepository<Follow, Long> {
}
