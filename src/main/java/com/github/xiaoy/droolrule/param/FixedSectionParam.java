package com.github.xiaoy.droolrule.param;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用规则时，需要填充的参数
 *
 * @author billow
 * @Date 2021/1/9 15:26
 * @return: null
 **/
@Data
public class FixedSectionParam {

    /**
     * 固定跳点
     *
     * @param jumpPointCondition: 跳点条件，1-固定值，2-区间值
     * @param salesAmount:        销售金额（跳点条件，1-固定值）
     * @param houseType:          产品类型：1-住宅，2-小于150w 商铺，3-150-300w 商铺，4-300w 以上商铺
     * @param commissionType:     提成类型：1-固定，2-点数，
     * @param amount:             提成金额，例如 销售金额、签约金额(个人)
     * @author billow
     * @Date 2021/1/10 13:33
     * @return: null
     **/
    public FixedSectionParam(String jumpPointCondition, BigDecimal salesAmount, String houseType, String commissionType,
                             BigDecimal amount) {
        this.jumpPointCondition = jumpPointCondition;
        this.salesAmount = salesAmount;
        this.houseType = houseType;
        this.commissionType = commissionType;
        this.amount = amount;
    }

    /**
     * 范围跳点
     *
     * @param jumpPointCondition: 跳点条件，1-固定值，2-区间值
     * @param salesNum:           成交套数（跳点条件，2-区间值）
     * @param houseType:          产品类型：1-住宅，2-小于150w 商铺，3-150-300w 商铺，4-300w 以上商铺
     * @param commissionType:     提成类型：1-固定，2-点数，
     * @param amount:             提成金额，例如 销售金额、签约金额(个人)
     * @author billow
     * @Date 2021/1/10 13:34
     * @return: null
     **/
    public FixedSectionParam(String jumpPointCondition, Integer salesNum, String houseType, String commissionType,
                             BigDecimal amount) {
        this.jumpPointCondition = jumpPointCondition;
        this.salesNum = salesNum;
        this.houseType = houseType;
        this.commissionType = commissionType;
        this.amount = amount;
    }

    // 跳点条件，1-固定值，2-区间值
    private String jumpPointCondition;
    // 销售金额（跳点条件，1-固定值）
    private BigDecimal salesAmount = BigDecimal.ZERO;
    // 成交套数（跳点条件，2-区间值）
    private Integer salesNum = 0;
    // 产品类型：1-住宅，2-小于150w 商铺，3-150-300w 商铺，4-300w 以上商铺
    private String houseType;
    // 提成类型：1-固定，2-点数，
    private String commissionType;
    // 提成金额，例如 销售金额、签约金额(个人)
    private BigDecimal amount = BigDecimal.ZERO;
    // 匹配后的结果，可能匹配多个
    private List<BigDecimal> result = new ArrayList<>();
}