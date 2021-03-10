package com.atguigu.gmall.sms.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Hasee  2021/3/10 19:30 周三
 * @version JDK 8.017
 * @description:
 */
@Data
public class SkuSaleVo  {

    private Long skuId;

    // 积分相关信息
    private BigDecimal growBounds;
    private BigDecimal buyBounds;
    private List<Integer> work;

    // 打折相关信息
    private Integer fullCount;
    private BigDecimal discount;
    private Integer ladderAddOther;

    // 满减相关信息
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer fullAddOther;

}
