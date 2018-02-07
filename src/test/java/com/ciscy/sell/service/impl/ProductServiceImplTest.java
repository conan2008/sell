package com.ciscy.sell.service.impl;

import com.ciscy.sell.bo.ProductInfo;
import com.ciscy.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhangyuan on 2018/2/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl service;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = service.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList = service.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = service.findAll(request);
//        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0, productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo info = new ProductInfo();
        info.setProductId("123457");
        info.setProductName("大螃蟹");
        info.setProductPrice(new BigDecimal(54.5));
        info.setProductStock(100);
        info.setProductDescription("好吃的大闸蟹");
        info.setProductIcon("http://xxx.jpg");
        info.setProductStatus(ProductStatusEnum.DOWN.getCode());
        info.setCategoryType(11);
        ProductInfo result = service.save(info);
        Assert.assertNotNull(result);
    }

}