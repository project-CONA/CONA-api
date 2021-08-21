package com.cona.projectcona.KakaoApiSdk.Enum;

import lombok.Getter;

@Getter
public enum PlaceCategoryCode {
    RESTAURANT("FD6"),
    CAFE("CS2");

    private String code;

    private PlaceCategoryCode(String code) {
        this.code = code;
    }

}
