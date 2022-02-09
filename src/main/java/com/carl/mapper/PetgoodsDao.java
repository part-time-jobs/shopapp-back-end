package com.carl.mapper;


import com.carl.entity.pojo.Petgoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface PetgoodsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Petgoods record);

    int insertSelective(Petgoods record);

    Petgoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Petgoods record);

    int updateByPrimaryKey(Petgoods record);
}