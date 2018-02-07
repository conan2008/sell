package com.ciscy.sell.vo;

import lombok.Data;

import java.util.List;

/**
 * http请求返回的最外层对象
 * Created by zhangyuan on 2018/2/7.
 */
@Data
public class ResultVO<T> {
    /** 错误码 **/
    private Integer code;
    /** 提示信息 **/
    private String msg;
    /** 具体内容 **/
    private T data;
}
