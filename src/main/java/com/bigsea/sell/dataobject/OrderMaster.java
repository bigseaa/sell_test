package com.bigsea.sell.dataobject;

import com.bigsea.sell.enums.OrderStatusEnum;
import com.bigsea.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单主表
 */
@Entity
@Data
public class OrderMaster {
    //订单id
    @Id
    private String orderId;
    //买家名字
    private String buyerName;
    //买家电话
    private String buyerPhone;
    //买家地址
    private String buyerAddress;
    //买家微信openid
    private String buyerOpenid;
    //订单总金额
    private BigDecimal orderAmount;
    //订单状态, 默认状态为0新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    //支付状态，默认为0，未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;

}
