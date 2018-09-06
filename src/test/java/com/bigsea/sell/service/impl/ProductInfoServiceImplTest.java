package com.bigsea.sell.service.impl;

import com.bigsea.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
   private ProductInfoServiceImpl productInfoService;
    @Test
    public void findOne() {
        ProductInfo productInfo = productInfoService.findOne("123456");
        System.out.println(productInfo);
    }


    @Test
    public void findUpAll() {
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());




    }

    @Test
    public void save() {
    }
}