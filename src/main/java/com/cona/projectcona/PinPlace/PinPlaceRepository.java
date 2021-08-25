package com.cona.projectcona.PinPlace;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PinPlaceRepository extends JpaRepository<PinPlace, Long> {
    Optional<PinPlace> findByUser(User user);
    Optional<PinPlace> findByPlace(Place place);
}
