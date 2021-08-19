package com.yc.product.controller;

import com.yc.product.model.vo.ProductVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yc.cloud.common.model.vo.R;

import java.math.BigDecimal;

/**
 * product controller
 *
 * @author: yc
 * @date: 2021-07-07
 */
@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    @GetMapping("/{id}")
    public R queryById(@PathVariable("id") String id) {
        ProductVO productVO = new ProductVO();
        productVO.setProductId(id);
        productVO.setProductName("产品1");
        productVO.setPrice(BigDecimal.TEN);
        return R.ofSuccess(productVO);
    }
}
