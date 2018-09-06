package com.bigsea.sell.dao;

import com.bigsea.sell.dataobject.ProductInfo;
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
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("测试外卖");
        productInfo.setProductPrice(new BigDecimal(22));
        productInfo.setCategoryType(1);
        productInfo.setProductStock(100);
        productInfo.setProductDescription("CESHI");
        productInfo.setProductIcon("aaa.jpg");
        productInfo.setProductStatus(0);
        ProductInfo p = productInfoDao.save(productInfo);
        System.out.println(p);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = productInfoDao.findByProductStatus(0);

    }
}