package com.ciscy.sell.dao;

import com.ciscy.sell.bo.ProductInfo;
import org.junit.Assert;
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
    private ProductInfoDao dao;

    @Test
    public void saveTest() {
        ProductInfo info = new ProductInfo();
        info.setProductId("123456");
        info.setProductName("旺仔牛奶");
        info.setProductPrice(new BigDecimal(5.5));
        info.setProductStock(100);
        info.setProductDescription("再看我就把你喝掉");
        info.setProductIcon("http://xxx.jpg");
        info.setProductStatus(0);
        info.setCategoryType(10);

        ProductInfo result = dao.save(info);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() {

        List<ProductInfo> productInfoList = dao.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }
}