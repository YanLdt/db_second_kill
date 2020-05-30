package com.yanl.server.service.impl;

import com.yanl.model.mapper.ItemKillMapper;
import com.yanl.model.pojo.ItemKill;
import com.yanl.server.service.IItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: YanL
 * @Time: 0:09 2020/5/31
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */

@Service
public class ItemService implements IItemService {

    private static final Logger log = LoggerFactory.getLogger(ItemService.class);

    @Autowired
    private ItemKillMapper itemKillMapper;

    /**
     * 获取待秒杀商品
     * @return
     * @throws Exception
     */
    @Override
    public List<ItemKill> getKillItems() throws Exception {
        return itemKillMapper.selectAll();
    }
}
