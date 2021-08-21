package com.cona.projectcona.KakaoApiSdk.Dto;

import com.cona.projectcona.KakaoApiSdk.Enum.PlaceCategoryCode;
import com.cona.projectcona.KakaoApiSdk.Enum.SortOption;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
public class KeywordSearchRequestDto {

    @NotBlank
    private String keyword;

    private PlaceCategoryCode categoryGroupCode;

    private String x;

    private String y;

    @Positive
    @Max(20000)
    private Integer radius;

    //TODO validation 추가 : regexp="좌측 X 좌표,좌측 Y 좌표, 우측 X 좌표, 우측 Y 좌표" 형식
    private String rect;

    @Positive
    @Max(45)
    private Integer page;

    private SortOption sort = SortOption.ACCURACY;
}
