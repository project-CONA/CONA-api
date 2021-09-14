package com.cona.projectcona.Follow;

import com.cona.projectcona.User.User;

/**
 * 팔로우 생성, 팔로우 삭제
 */
public interface FollowService {
    Follow createFollow(User follower, User following);
    Follow removeFollow(User follower, User following);
}
