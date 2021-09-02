package com.cona.projectcona.UserPlace.PinPlace;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PinPlaceServiceImpl implements PinPlaceService{
    @Override
    public PinPlace createPinPlace(User user, Place place) {
        return null;
    }

    @Override
    public PinPlace removePinPlace(Long pinPlaceId) {
        return null;
    }
}
