package com.cona.projectcona.Follow;

import com.cona.projectcona.PinPlace.PinPlace;
import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;

/**
 * 팔로우 생성, 팔로우 삭제
 */
public interface FollowService {
    PinPlace createFollow(User follower, User following);
    PinPlace removeFollow(User follower, User following);
}
