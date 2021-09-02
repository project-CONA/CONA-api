package com.cona.projectcona.KakaoPlaceSearchApiSdk.Enum;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum PlaceCategoryCode {
    RESTAURANT("FD6"),
    CAFE("CS2");

    private String code;

    private PlaceCategoryCode(String code) {
        this.code = code;
    }

    /*
    TODO
    RESTUARNT, CAFE 이외의 값이 들어왔을 때 예외처리
     */
    @JsonCreator
    public static PlaceCategoryCode fromValue(String value) {
        switch (value) {
            case "RESTUARANT":
                return PlaceCategoryCode.RESTAURANT;
            case "CAFE":
                return PlaceCategoryCode.CAFE;
        }
        return null;
    }

}
