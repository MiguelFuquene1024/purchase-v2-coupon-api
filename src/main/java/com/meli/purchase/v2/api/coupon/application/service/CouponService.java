package com.meli.purchase.v2.api.coupon.application.service;

import reactor.core.publisher.Mono;

import java.util.Map;

public interface CouponService {

    Mono<Map<String,Integer>> getTop5Coupons();
}
