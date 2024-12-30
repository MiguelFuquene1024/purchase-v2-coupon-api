package com.meli.purchase.v2.api.coupon.infrastructure.controller;

import com.meli.purchase.v2.api.coupon.application.service.CouponService;
import com.meli.purchase.v2.api.coupon.infrastructure.adapter.CouponServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CouponController {
    private final CouponServiceImpl couponService;

    @GetMapping("/top5")
    public Mono<Map<String,Integer>> getTop5Coupon() {
        return couponService.getTop5Coupons();
    }
    @GetMapping
    public Mono<ResponseEntity<String>> getHealthCheck() {
        return Mono.just(ResponseEntity.ok("health check ok"));
    }

}
