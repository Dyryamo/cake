package com.cake.dao;

import com.cake.bean.AssociateOrderAndProduct;
import com.cake.bean.AssociateOrderAndProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociateOrderAndProductMapper {
    long countByExample(AssociateOrderAndProductExample example);

    int deleteByExample(AssociateOrderAndProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssociateOrderAndProduct record);

    int insertSelective(AssociateOrderAndProduct record);

    List<AssociateOrderAndProduct> selectByExample(AssociateOrderAndProductExample example);

    AssociateOrderAndProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssociateOrderAndProduct record, @Param("example") AssociateOrderAndProductExample example);

    int updateByExample(@Param("record") AssociateOrderAndProduct record, @Param("example") AssociateOrderAndProductExample example);

    int updateByPrimaryKeySelective(AssociateOrderAndProduct record);

    int updateByPrimaryKey(AssociateOrderAndProduct record);
}