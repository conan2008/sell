package com.ciscy.sell.dao;

import com.ciscy.sell.bo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao dao;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = dao.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("momo", 4);
        ProductCategory result = dao.save(productCategory);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null, result);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = dao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}