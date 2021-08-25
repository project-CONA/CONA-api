package com.cona.projectcona.User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository UserRepository;

    @Override
    public User join() {
        // 카카오 회원가입 및 회원 정보 저장
        return null;
    }

    @Override
    public User login() {
        return null;
    }

    @Override
    public User logout() {
        return null;
    }

    @Override
    public User editUser() {
        return null;
    }

    @Override
    public User searchUser(Long searchId) {
        return null;
    }

    @Override
    public User followUser(Long followerId, Long followingId) {
        return null;
    }
}
