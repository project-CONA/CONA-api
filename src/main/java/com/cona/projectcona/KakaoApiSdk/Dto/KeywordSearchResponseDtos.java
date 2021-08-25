package com.cona.projectcona.KakaoApiSdk.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class KeywordSearchResponseDtos {
    private List<KeywordSearchResponseDto> documents;
}
