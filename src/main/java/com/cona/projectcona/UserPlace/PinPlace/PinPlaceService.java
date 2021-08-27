package com.cona.projectcona.UserPlace.PinPlace;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;

/**
 * 핀 생성, 핀 삭제
 */
public interface PinPlaceService{
    PinPlace createPinPlace(User user, Place place);
    PinPlace removePinPlace(Long pinPlaceId);
}
