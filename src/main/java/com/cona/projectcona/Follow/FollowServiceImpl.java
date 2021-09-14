package com.cona.projectcona.Follow;

import com.cona.projectcona.User.User;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl implements FollowService{
    @Override
    public Follow createFollow(User follower, User following) {
        return null;
    }

    @Override
    public Follow removeFollow(User follower, User following) {
        return null;
    }
}
