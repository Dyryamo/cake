package com.cake.dao;

import com.cake.bean.associateOrderAndProduct;
import com.cake.bean.associateOrderAndProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface associateOrderAndProductMapper {
    long countByExample(associateOrderAndProductExample example);

    int deleteByExample(associateOrderAndProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(associateOrderAndProduct record);

    int insertSelective(associateOrderAndProduct record);

    List<associateOrderAndProduct> selectByExample(associateOrderAndProductExample example);

    associateOrderAndProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") associateOrderAndProduct record, @Param("example") associateOrderAndProductExample example);

    int updateByExample(@Param("record") associateOrderAndProduct record, @Param("example") associateOrderAndProductExample example);

    int updateByPrimaryKeySelective(associateOrderAndProduct record);

    int updateByPrimaryKey(associateOrderAndProduct record);
}