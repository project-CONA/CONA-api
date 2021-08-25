package com.cona.projectcona.KakaoApiSdk;

import com.cona.projectcona.KakaoApiSdk.Enum.PlaceCategoryCode;
import com.cona.projectcona.KakaoApiSdk.Dto.KeywordSearchRequestDto;
import com.cona.projectcona.KakaoApiSdk.Dto.KeywordSearchResponseDtos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class KakaoApiSdkTest {

    @Autowired
    private KakaoApiSdk kakaoApiSdk;

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