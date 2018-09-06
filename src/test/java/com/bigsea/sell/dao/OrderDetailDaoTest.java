package com.bigsea.sell.dao;

import com.bigsea.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("121212");
        orderDetail.setProductIcon("html.jpg");
        orderDetail.setProductId("123456");
        orderDetail.setProductName("油泼面");
        orderDetail.setProductPrice(new BigDecimal(1.2));
        orderDetail.setProductQuantity(2);

        orderDetailDao.save(orderDetail);
    }

    @Test
    public void findByOrOrderId() {
        List<OrderDetail> byOrOrderId = orderDetailDao.findByOrOrderId("121212");
        System.out.println(byOrOrderId);
    }
}