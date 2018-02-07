package com.ciscy.sell.controller;

import com.ciscy.sell.vo.ProductInfoVO;
import com.ciscy.sell.vo.ProductVO;
import com.ciscy.sell.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 买家商品
 * Created by zhangyuan on 2018/2/7.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("list")
    public ResultVO list() {
        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));

        resultVO.setData(Arrays.asList(productVO));
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }

}
