package com.cona.projectcona.KakaoApiSdk.Enum;

import lombok.Getter;

@Getter
public enum SortOption {
    DISTANCE("distance"),
    ACCURACY("accuracy");

    private String option;

    SortOption(String option) {
    }
}
