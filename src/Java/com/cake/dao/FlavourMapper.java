package com.cake.dao;

import com.cake.bean.Flavour;
import com.cake.bean.FlavourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlavourMapper {
    long countByExample(FlavourExample example);

    int deleteByExample(FlavourExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Flavour record);

    int insertSelective(Flavour record);

    List<Flavour> selectByExample(FlavourExample example);

    Flavour selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Flavour record, @Param("example") FlavourExample example);

    int updateByExample(@Param("record") Flavour record, @Param("example") FlavourExample example);

    int updateByPrimaryKeySelective(Flavour record);

    int updateByPrimaryKey(Flavour record);
}