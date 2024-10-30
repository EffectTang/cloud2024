package com.atguigu.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
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
public class PayDTO implements Serializable {

    private Integer id;
    private String payNo;
    private String orderNo;
    private Integer userId;
    private BigDecimal amount;
}
