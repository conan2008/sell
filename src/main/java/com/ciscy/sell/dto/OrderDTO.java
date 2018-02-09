package com.ciscy.sell.dto;

import com.ciscy.sell.bo.OrderDetail;
import com.ciscy.sell.enums.OrderStatusEnum;
import com.ciscy.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangyuan on 2018/2/8.
 */
@Data
public class OrderDTO {

    /** 订单id **/
    private String orderId;
    /** 买家名字 **/
    private String buyerName;
    /** 买家电话 **/
    private String buyerPhone;
    /** 买家地址 **/
    private String buyerAddress;
    /** 买家微信Openid **/
    private String buyerOpenid;
    /** 订单总金额 **/
    private BigDecimal orderAmount;
    /** 订单状态 , 默认为0，新下单 **/
    private Integer orderStatus;
    /** 支付状态， 默认为0，未支付 **/
    private Integer payStatus ;
    /** 创建时间 **/
    private Date createTime;
    /** 更新时间 **/
    private Date updateTime;
    @Transient //数据库忽略该字段
    private List<OrderDetail> orderDetailList;
}
