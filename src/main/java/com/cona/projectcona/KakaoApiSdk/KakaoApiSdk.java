package com.cona.projectcona.KakaoApiSdk;

import com.cona.projectcona.KakaoApiSdk.Dto.KeywordSearchRequestDto;
import com.cona.projectcona.KakaoApiSdk.Dto.KeywordSearchResponseDtos;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class KakaoApiSdk {

    private final WebClient.Builder builder;

    private final Environment environment;


    private final String BASEURL = "https://dapi.kakao.com/v2/local/search/keyword.json";

    private final int SIZE = 15;


    public KeywordSearchResponseDtos keywordSearch(KeywordSearchRequestDto requestDto) {

        WebClient webClient = builder
                .baseUrl(this.BASEURL)
                .build();

        /*
        TODO
        4개의 rect 값이 안들어왔을 경우 예외처리 추가
         */
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("query", requestDto.getKeyword())
                        .queryParam("category_group_code", requestDto.getCategoryGroupCode().getCode())
                        .queryParam("x", requestDto.getX())
                        .queryParam("y", requestDto.getY())
                        .queryParam("radius", requestDto.getRadius())
                        .queryParam("page", requestDto.getPage())
                        .queryParam("size", this.SIZE)
                        .queryParam("sort", requestDto.getSort().getOption())
                        .build()
                )
                .accept(MediaType.APPLICATION_JSON)
                .headers(httpHeaders -> {
                    httpHeaders.add("Authorization", "KakaoAK " + environment.getProperty("kakao.rest-api-key"));
                })
                .retrieve()
                .bodyToMono(KeywordSearchResponseDtos.class)
                .block();
    }
}
