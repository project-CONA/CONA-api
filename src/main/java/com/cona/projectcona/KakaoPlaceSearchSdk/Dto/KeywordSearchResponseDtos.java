package com.cona.projectcona.KakaoPlaceSearchSdk.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class KeywordSearchResponseDtos {
    private List<KeywordSearchResponseDto> documents;
}
