package com.yanl.model.mapper;

import com.yanl.model.pojo.ItemKill;

import java.util.List;

public interface ItemKillMapper {

    List<ItemKill> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(ItemKill record);

    int insertSelective(ItemKill record);

    ItemKill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemKill record);

    int updateByPrimaryKey(ItemKill record);
}