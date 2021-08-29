package com.baqw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baqw.common.utils.PageUtils;
import com.baqw.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * ??Ʒ???ۻظ???ϵ
 *
 * @author baqw
 * @email baqingwang@qq.com
 * @date 2021-08-29 21:48:01
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

