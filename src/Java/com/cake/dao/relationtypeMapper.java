package com.cake.dao;

import com.cake.bean.relationtype;
import com.cake.bean.relationtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface relationtypeMapper {
    long countByExample(relationtypeExample example);

    int deleteByExample(relationtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(relationtype record);

    int insertSelective(relationtype record);

    List<relationtype> selectByExample(relationtypeExample example);

    relationtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") relationtype record, @Param("example") relationtypeExample example);

    int updateByExample(@Param("record") relationtype record, @Param("example") relationtypeExample example);

    int updateByPrimaryKeySelective(relationtype record);

    int updateByPrimaryKey(relationtype record);
}