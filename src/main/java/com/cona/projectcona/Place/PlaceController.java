package com.cona.projectcona.Place;

import com.cona.projectcona.KakaoPlaceSearchSdk.Dto.KeywordSearchResponseDtos;
import com.cona.projectcona.Place.Dto.PlaceRequestDto;
import com.cona.projectcona.Place.Dto.PlaceResponseDtos;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/place")
public class PlaceController {

    private final PlaceServiceImpl placeService;

    @GetMapping("/search")
    public PlaceResponseDtos searchPlace(@RequestBody @Valid PlaceRequestDto placeRequestDto) {
        KeywordSearchResponseDtos keywordSearchResponseDtos = placeService.searchPlace(placeRequestDto);

        PlaceResponseDtos placeResponseDtos = new PlaceResponseDtos();
        //TODO 핀 처리된 Place 엔티티 검색 후 PlaceResponseDto에 KeywordSearchResponseDtos와 취합
        return placeResponseDtos;
    }
}
