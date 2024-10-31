package com.atguigu.cloud.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author starlord
 * @description
 * @create 2024/10/30
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Schema(title = "支付交易表实体类")
public class PayDTO implements Serializable {

    @Schema(title = "主键")
    private Integer id;
    @Schema(title = "支付流水号")
    private String payNo;
    @Schema(title = "订单流水号")
    private String orderNo;
    @Schema(title = "用户账号ID")
    private Integer userId;
    @Schema(title = "交易金额")
    private BigDecimal amount;
}
