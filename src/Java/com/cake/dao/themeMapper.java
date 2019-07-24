package com.cake.dao;

import com.cake.bean.theme;
import com.cake.bean.themeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface themeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    long countByExample(themeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int deleteByExample(themeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int insert(theme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int insertSelective(theme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    List<theme> selectByExample(themeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    theme selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int updateByExampleSelective(@Param("record") theme record, @Param("example") themeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int updateByExample(@Param("record") theme record, @Param("example") themeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int updateByPrimaryKeySelective(theme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table theme
     *
     * @mbg.generated Wed Jul 24 09:58:14 CST 2019
     */
    int updateByPrimaryKey(theme record);
}