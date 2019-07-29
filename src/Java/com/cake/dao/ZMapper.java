package com.cake.dao;

import com.cake.bean.OrderTmp;

import java.util.List;

public interface ZMapper {
    public List<OrderTmp> selectOrderTmp(int id);
}
