package com.baqw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baqw.common.utils.PageUtils;
import com.baqw.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * ????????Ϣ
 *
 * @author baqw
 * @email baqingwang@qq.com
 * @date 2021-08-30 23:07:05
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

