package com.cona.projectcona.Image;

import com.cona.projectcona.User.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Profile")
@Getter
@NoArgsConstructor
public class ProfileImage extends Image{

    @OneToOne(mappedBy = "profileImage", fetch = FetchType.LAZY)
    private User user;
}
