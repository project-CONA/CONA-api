package com.cona.projectcona.Follow;

import com.cona.projectcona.UserPlace.PinPlace.PinPlace;
import com.cona.projectcona.User.User;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl implements FollowService{
    @Override
    public PinPlace createFollow(User follower, User following) {
        return null;
    }

    @Override
    public PinPlace removeFollow(User follower, User following) {
        return null;
    }
}
