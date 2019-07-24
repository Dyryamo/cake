package com.cake.dao;

import com.cake.bean.address;
import com.cake.bean.addressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface addressMapper {
    long countByExample(addressExample example);

    int deleteByExample(addressExample example);

    int insert(address record);

    int insertSelective(address record);

    List<address> selectByExample(addressExample example);

    int updateByExampleSelective(@Param("record") address record, @Param("example") addressExample example);

    int updateByExample(@Param("record") address record, @Param("example") addressExample example);
}