package com.cona.projectcona.UserPlace.PinPlace;

import com.cona.projectcona.Place.Place;
import com.cona.projectcona.User.User;
import com.cona.projectcona.UserPlace.UserPlace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("pin_place")
@Getter @Setter
@NoArgsConstructor
public class PinPlace extends UserPlace {

}
