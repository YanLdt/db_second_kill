package com.yanl.model.mapper;

import com.yanl.model.pojo.ItemKillSuccess;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemKillSuccessMapper {

    int deleteByPrimaryKey(String code);

    int insert(ItemKillSuccess record);

    int insertSelective(ItemKillSuccess record);

    ItemKillSuccess selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(ItemKillSuccess record);

    int updateByPrimaryKey(ItemKillSuccess record);
}