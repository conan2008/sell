package com.ciscy.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 * Created by zhangyuan on 2018/2/7.
 */
@Data
public class ProductVO {

    @JsonProperty("name") //返回的json真是 key
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
