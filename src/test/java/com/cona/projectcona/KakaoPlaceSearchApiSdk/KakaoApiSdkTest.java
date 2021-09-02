package com.cona.projectcona.KakaoPlaceSearchApiSdk;

import com.cona.projectcona.KakaoPlaceSearchApiSdk.Enum.PlaceCategoryCode;
import com.cona.projectcona.KakaoPlaceSearchApiSdk.Dto.KeywordSearchRequestDto;
import com.cona.projectcona.KakaoPlaceSearchApiSdk.Dto.KeywordSearchResponseDtos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class KakaoApiSdkTest {

    @Autowired
    private KakaoPlaceSearchApiSdk kakaoApiSdk;

    @Test
    void keywordSearch() {
        //given
        KeywordSearchRequestDto requestDto = new KeywordSearchRequestDto();
        requestDto.setKeyword("사가정");
        requestDto.setCategoryGroupCode(PlaceCategoryCode.RESTAURANT);

        //when
        KeywordSearchResponseDtos responseDtos = kakaoApiSdk.keywordSearch(requestDto);

        //then
        assertNotNull(responseDtos.getDocuments().get(0).getPlaceName());
    }
}