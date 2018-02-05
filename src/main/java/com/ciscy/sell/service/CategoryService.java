package com.ciscy.sell.service;

import com.ciscy.sell.bo.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer catagoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
