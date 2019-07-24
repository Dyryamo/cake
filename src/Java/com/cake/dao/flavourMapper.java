package com.cake.dao;

import com.cake.bean.flavour;
import com.cake.bean.flavourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface flavourMapper {
    long countByExample(flavourExample example);

    int deleteByExample(flavourExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(flavour record);

    int insertSelective(flavour record);

    List<flavour> selectByExample(flavourExample example);

    flavour selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") flavour record, @Param("example") flavourExample example);

    int updateByExample(@Param("record") flavour record, @Param("example") flavourExample example);

    int updateByPrimaryKeySelective(flavour record);

    int updateByPrimaryKey(flavour record);
}