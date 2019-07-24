package com.cake.dao;

import com.cake.bean.theme;
import com.cake.bean.themeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface themeMapper {
    long countByExample(themeExample example);

    int deleteByExample(themeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(theme record);

    int insertSelective(theme record);

    List<theme> selectByExample(themeExample example);

    theme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") theme record, @Param("example") themeExample example);

    int updateByExample(@Param("record") theme record, @Param("example") themeExample example);

    int updateByPrimaryKeySelective(theme record);

    int updateByPrimaryKey(theme record);
}