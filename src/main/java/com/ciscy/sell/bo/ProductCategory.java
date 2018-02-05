package com.ciscy.sell.bo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Entity springboot 标识bean
 * @DynamicUpdate 动态更新,自动更新，比如更新时间
 * @Data //lombok插件，添加maven，Plugins 增加 lombok
 */
@Entity
@DynamicUpdate //动态更新,自动更新，比如更新时间
@Data //lombok插件，
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;
    // 类目名称
    private String categoryName;
    // 类目编号
    private Integer categoryType;

    //private Date createTime;
    //private Date updateTime;


    public ProductCategory() {

    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
