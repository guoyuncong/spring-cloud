package com.yc.product.model.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * product vo
 *
 * @author: yc
 * @date: 2021-07-07
 */
@Data
public class ProductVO {

    /**
     * 产品ID
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品价格
     */
    private BigDecimal price;
}
