package com.ciscy.sell.service.impl;

import com.ciscy.sell.bo.ProductInfo;
import com.ciscy.sell.dao.ProductInfoDao;
import com.ciscy.sell.enums.ProductStatusEnum;
import com.ciscy.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangyuan on 2018/2/7.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoDao dao;

    @Override
    public ProductInfo findOne(String productId) {
        return dao.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return dao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return dao.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo info) {
        return dao.save(info);
    }
}
