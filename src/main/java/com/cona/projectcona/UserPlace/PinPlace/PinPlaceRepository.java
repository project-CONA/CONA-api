package com.cona.projectcona.UserPlace.PinPlace;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PinPlaceRepository extends JpaRepository<PinPlace, Long> {
    Optional<PinPlace> findByUser(User user);
    Optional<PinPlace> findByPlace(Place place);
}
