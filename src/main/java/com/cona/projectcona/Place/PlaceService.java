package com.cona.projectcona.Place;

import com.cona.projectcona.KakaoPlaceSearchApiSdk.Dto.KeywordSearchResponseDtos;
import com.cona.projectcona.Place.Dto.PlaceRequestDto;

public interface PlaceService {

    public KeywordSearchResponseDtos searchPlace(PlaceRequestDto placeRequestDto);
}