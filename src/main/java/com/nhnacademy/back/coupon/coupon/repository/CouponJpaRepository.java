package com.nhnacademy.back.coupon.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhnacademy.back.coupon.coupon.domain.entity.Coupon;

public interface CouponJpaRepository extends JpaRepository<Coupon, Long> {
}
