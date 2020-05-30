package com.yanl.model.mapper;

import com.yanl.model.pojo.RandomCode;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RandomCodeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RandomCode record);

    int insertSelective(RandomCode record);

    RandomCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RandomCode record);

    int updateByPrimaryKey(RandomCode record);
}