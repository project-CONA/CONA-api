package com.cona.projectcona.KakaoPlaceSearchSdk.Enum;

import lombok.Getter;

@Getter
public enum SortOption {
    DISTANCE("distance"),
    ACCURACY("accuracy");

    private String option;

    private SortOption(String option) {
        this.option = option;
    }
}
