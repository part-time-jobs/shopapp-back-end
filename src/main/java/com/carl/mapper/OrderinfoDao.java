package com.carl.mapper;


import com.carl.entity.pojo.Orderinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderinfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderinfo record);

    int insertSelective(Orderinfo record);

    Orderinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderinfo record);

    int updateByPrimaryKey(Orderinfo record);
}