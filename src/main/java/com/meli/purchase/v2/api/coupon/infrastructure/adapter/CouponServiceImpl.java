package com.meli.purchase.v2.api.coupon.infrastructure.adapter;

import com.meli.purchase.v2.api.coupon.application.exception.CustomException;
import com.meli.purchase.v2.api.coupon.application.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {

    private final WebClient webClient;

    @Override
    public Mono<Map<String, Integer>> getTop5Coupons() {
        return fetchTop5Coupons();
    }
    private Mono<Map<String,Integer>> fetchTop5Coupons() {
        return webClient.get().uri("/coupon/top5")
                .retrieve().bodyToMono(new ParameterizedTypeReference<Map<String, Integer>>() {})
                .onErrorResume(e -> Mono.error(new CustomException(HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage())));
    }
}
