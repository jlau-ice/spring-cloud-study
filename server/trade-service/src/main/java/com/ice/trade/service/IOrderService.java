package com.ice.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.trade.domain.dto.OrderFormDTO;
import com.ice.trade.domain.po.Order;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ice
 * @since 2023-05-05
 */
public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormDTO orderFormDTO);

    void markOrderPaySuccess(Long orderId);
}
