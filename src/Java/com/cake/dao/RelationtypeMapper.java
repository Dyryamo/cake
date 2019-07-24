package com.cake.dao;

import com.cake.bean.Relationtype;
import com.cake.bean.RelationtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationtypeMapper {
    long countByExample(RelationtypeExample example);

    int deleteByExample(RelationtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Relationtype record);

    int insertSelective(Relationtype record);

    List<Relationtype> selectByExample(RelationtypeExample example);

    Relationtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Relationtype record, @Param("example") RelationtypeExample example);

    int updateByExample(@Param("record") Relationtype record, @Param("example") RelationtypeExample example);

    int updateByPrimaryKeySelective(Relationtype record);

    int updateByPrimaryKey(Relationtype record);
}