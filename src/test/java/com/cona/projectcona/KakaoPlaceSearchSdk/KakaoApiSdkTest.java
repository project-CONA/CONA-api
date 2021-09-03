package com.cona.projectcona.KakaoPlaceSearchSdk;

import com.cona.projectcona.KakaoPlaceSearchSdk.Enum.PlaceCategoryCode;
import com.cona.projectcona.KakaoPlaceSearchSdk.Dto.KeywordSearchRequestDto;
import com.cona.projectcona.KakaoPlaceSearchSdk.Dto.KeywordSearchResponseDtos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class KakaoApiSdkTest {

    @Autowired
    private KakaoPlaceSearchSdk kakaoApiSdk;

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