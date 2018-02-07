package com.ciscy.sell.service;

import com.ciscy.sell.bo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * Created by zhangyuan on 2018/2/7.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo info);

    /**
     * 加库存
     */

    /**
     * 减库存
     */
}
