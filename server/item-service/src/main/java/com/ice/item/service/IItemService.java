package com.ice.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ice.item.domain.dto.ItemDTO;
import com.ice.item.domain.dto.OrderDetailDTO;
import com.ice.item.domain.po.Item;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author ice
 * @since 2023-05-05
 */
public interface IItemService extends IService<Item> {

    void deductStock(List<OrderDetailDTO> items);

    List<ItemDTO> queryItemByIds(Collection<Long> ids);
}
