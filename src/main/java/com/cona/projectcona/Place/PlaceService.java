package com.cona.projectcona.Place;

import com.cona.projectcona.KakaoPlaceSearchSdk.Dto.KeywordSearchResponseDtos;
import com.cona.projectcona.Place.Dto.PlaceRequestDto;

public interface PlaceService {

    public KeywordSearchResponseDtos searchPlace(PlaceRequestDto placeRequestDto);
}
