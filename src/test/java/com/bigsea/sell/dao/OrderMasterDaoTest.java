package com.bigsea.sell.dao;

import com.bigsea.sell.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("141414");
        orderMaster.setBuyerName("三师兄");
        orderMaster.setBuyerPhone("15877777777");
        orderMaster.setBuyerAddress("呼伦傻儿");
        orderMaster.setBuyerOpenid("933933");
        orderMaster.setOrderAmount(new BigDecimal(100.2));
        orderMasterDao.saveAndFlush(orderMaster);
    }
    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(0, 3);
        Page<OrderMaster> page = orderMasterDao.findByBuyerOpenid("911911", request);
        System.out.println(page.getTotalElements());
    }
}