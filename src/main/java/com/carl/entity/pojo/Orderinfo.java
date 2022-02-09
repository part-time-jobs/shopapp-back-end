package com.carl.entity.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * orderinfo
 * @author 
 */
@ApiModel(value="pojo.Orderinfo订单")
@Data
public class Orderinfo implements Serializable {
    private Integer id;

    /**
     * 订单编号
     */
    @ApiModelProperty(value="订单编号")
    private String orderno;

    /**
     * 用户Id
     */
    @ApiModelProperty(value="用户Id")
    private String userid;

    /**
     * 下单人
     */
    @ApiModelProperty(value="下单人")
    private String buyuser;

    /**
     * 下单人电话
     */
    @ApiModelProperty(value="下单人电话")
    private String buyphone;

    /**
     * 下单人地址
     */
    @ApiModelProperty(value="下单人地址")
    private String buyaddr;

    /**
     * 物品Id
     */
    @ApiModelProperty(value="物品Id")
    private Integer goodsid;

    /**
     * 商品编号
     */
    @ApiModelProperty(value="商品编号")
    private String goodsno;

    /**
     * 商品名称（组合名称）
     */
    @ApiModelProperty(value="商品名称（组合名称）")
    private String goodsname;

    /**
     * 购买个数
     */
    @ApiModelProperty(value="购买个数")
    private Integer num;

    /**
     * 订单总金额
     */
    @ApiModelProperty(value="订单总金额")
    private BigDecimal amounttotal;

    /**
     * 折扣
     */
    @ApiModelProperty(value="折扣")
    private BigDecimal discount;

    /**
     * 实际总付款
     */
    @ApiModelProperty(value="实际总付款")
    private BigDecimal realamounttotal;

    /**
     * 商家Id
     */
    @ApiModelProperty(value="商家Id")
    private Integer shopid;

    /**
     * 商家名称
     */
    @ApiModelProperty(value="商家名称")
    private String shopname;

    /**
     * 商家电话
     */
    @ApiModelProperty(value="商家电话")
    private String shopphone;

    /**
     * 商家地址
     */
    @ApiModelProperty(value="商家地址")
    private String shopaddr;

    /**
     * 1有效2无效
     */
    @ApiModelProperty(value="1有效2无效")
    private Integer datastatus;

    private Date createdate;

    /**
     * 更新时间
     */
    @ApiModelProperty(value="更新时间")
    private Date updatedate;

    /**
     * 1已完成2待支付3待取货
     */
    @ApiModelProperty(value="1已完成2待支付3待取货")
    private Integer orderstatus;

    /**
     * 商品规格Id
     */
    @ApiModelProperty(value="商品规格Id")
    private Integer goodsspecid;

    /**
     * 商品规格名称
     */
    @ApiModelProperty(value="商品规格名称")
    private String goodsspecname;

    /**
     * 单个售卖价
     */
    @ApiModelProperty(value="单个售卖价")
    private BigDecimal price;

    /**
     * 单个成本价
     */
    @ApiModelProperty(value="单个成本价")
    private BigDecimal costprice;

    /**
     * 取货方式（0到店自提1邮寄）
     */
    @ApiModelProperty(value="取货方式（0到店自提1邮寄）")
    private Integer delivertype;

    private String paytype;

    /**
     * 订单流水号
     */
    @ApiModelProperty(value="订单流水号")
    private String flowno;

    private static final long serialVersionUID = 1L;
}