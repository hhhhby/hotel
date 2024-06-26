package com.hby.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true) //开起chain=true后可以使用链式的set
@TableName("tb_user")
public class User {


    @TableId
    private Long id;
    private String passward;



}
