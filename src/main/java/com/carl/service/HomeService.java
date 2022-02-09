package com.carl.service;

import com.carl.entity.pojo.Petgoods;
import com.carl.mapper.PetgoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangtao
 * @Title:
 * @Package: com.carl.service
 * @Description:
 * @date 2/9/22 8:54 PM
 */
@Service
public class HomeService {
    @Autowired
    private PetgoodsDao petgoodsDao;
    public Petgoods selectByPrimaryKey(int id){
        return petgoodsDao.selectByPrimaryKey(id);
    }
}
