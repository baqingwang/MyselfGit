package com.baqw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baqw.common.utils.PageUtils;
import com.baqw.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author baqw
 * @email baqingwang@qq.com
 * @date 2021-08-29 21:48:01
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

