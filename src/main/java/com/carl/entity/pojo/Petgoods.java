package com.carl.entity.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;


/**
 * petgoods
 * @author 
 */
@Data
public class Petgoods implements Serializable {
    private Integer id;

    /**
     * 商户Id
     */
    private Integer shopid;

    /**
     * 商品编号
     */
    private String goodsno;

    /**
     * 1有效2上架3下架4删除
     */
    private Integer datastatus;

    /**
     * 标题
     */
    private String title;

    /**
     * 分类Id
     */
    private Integer classify;

    /**
     * 分类名称
     */
    private String classifyname;

    /**
     * 商品图片
     */
    private String goodsimage;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 售卖价
     */
    private BigDecimal saleamount;

    private Date createdate;

    /**
     * 更新时间
     */
    private Date updatedate;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 优先顺序
     */
    private Integer ordernum;

    private static final long serialVersionUID = 1L;
}