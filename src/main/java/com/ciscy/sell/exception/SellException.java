package com.ciscy.sell.exception;

import com.ciscy.sell.enums.ResultEnum;

/**
 * Created by zhangyuan on 2018/2/8.
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
