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

    // ex) 37.56203
    private final static String SINGLE_COOR_REGEX = "^[+\\-]?[0-9]{1,3}\\.[0-9]{3,}";

    @NotBlank
    private String keyword;

    private PlaceCategoryCode categoryGroupCode;

    @Pattern(regexp = KeywordSearchRequestDto.SINGLE_COOR_REGEX)
    private String x;

    @Pattern(regexp = KeywordSearchRequestDto.SINGLE_COOR_REGEX)
    private String y;

    @Positive
    @Max(20000)
    private Integer radius;

    @Pattern(regexp = KeywordSearchRequestDto.SINGLE_COOR_REGEX)
    private String rectLeftX;

    @Pattern(regexp = KeywordSearchRequestDto.SINGLE_COOR_REGEX)
    private String rectLeftY;

    @Pattern(regexp = KeywordSearchRequestDto.SINGLE_COOR_REGEX)
    private String rectRightX;

    @Pattern(regexp = KeywordSearchRequestDto.SINGLE_COOR_REGEX)
    private String rectRightY;

    @Positive
    @Max(45)
    private Integer page;

    private SortOption sort = SortOption.ACCURACY;
}
