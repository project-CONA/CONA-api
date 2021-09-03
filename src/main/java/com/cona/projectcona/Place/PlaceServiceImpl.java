package com.cona.projectcona.Place;

import com.cona.projectcona.KakaoPlaceSearchSdk.Dto.KeywordSearchRequestDto;
import com.cona.projectcona.KakaoPlaceSearchSdk.Dto.KeywordSearchResponseDtos;
import com.cona.projectcona.KakaoPlaceSearchSdk.KakaoPlaceSearchSdk;
import com.cona.projectcona.Place.Dto.PlaceRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private final KakaoPlaceSearchSdk kakaoApiSdk;

    private final PlaceRepository placeRepository;
    @Override
    public KeywordSearchResponseDtos searchPlace(PlaceRequestDto placeRequestDto) {
        KeywordSearchRequestDto keywordSearchRequestDto = new KeywordSearchRequestDto();
        //TODO 기획후, 검색리퀘스트 DTO 생성 로직 추가
        return kakaoApiSdk.keywordSearch(keywordSearchRequestDto);
    }
}
