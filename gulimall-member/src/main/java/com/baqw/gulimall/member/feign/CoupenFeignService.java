package com.baqw.gulimall.member.feign;

import com.baqw.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CoupenFeignService {
    /**
     * 这里的方法名要和远程调用方法的名字完全相同
     * @return
     */
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupon();
}
