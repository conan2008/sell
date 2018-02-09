package com.ciscy.sell.util;

import com.ciscy.sell.bo.OrderMaster;
import com.ciscy.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhangyuan on 2018/2/9.
 */
public class ConverterUtil {

    public static OrderDTO convertOrderMaster2DTO(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convertOrderMaster2DTO4List(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                convertOrderMaster2DTO(e)
        ).collect(Collectors.toList());
    }
}
