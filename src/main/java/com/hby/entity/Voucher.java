package com.hby.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true) //开起chain=true后可以使用链式的set
@TableName("tb_voucher")
public class Voucher {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    private Long shopId;

    private String title;

    private String subTitle;

    private String rules;

    private Long payValue;

    private Long actualValue;

    private Integer type;

    private Integer status;

    @TableField(exist = false)
    private Integer stock;

    @TableField(exist = false)
    private LocalDateTime beginTime;

    @TableField(exist = false)
    private LocalDateTime endTime;

}
