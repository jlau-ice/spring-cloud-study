package com.ice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.domain.dto.CartFormDTO;
import com.ice.domain.po.Cart;
import com.ice.domain.vo.CartVO;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 订单详情表 服务类
 * </p>
 *
 * @author ice
 * @since 2023-05-05
 */
public interface ICartService extends IService<Cart> {

    void addItem2Cart(CartFormDTO cartFormDTO);

    List<CartVO> queryMyCarts();

    void removeByItemIds(Collection<Long> itemIds);
}
