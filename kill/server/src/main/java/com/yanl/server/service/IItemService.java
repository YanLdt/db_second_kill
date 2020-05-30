package com.yanl.server.service;

import com.yanl.model.pojo.ItemKill;

import java.util.List;

/**
 * @Author: YanL
 * @Time: 0:09 2020/5/31
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public interface IItemService {

    List<ItemKill> getKillItems() throws Exception;

}
