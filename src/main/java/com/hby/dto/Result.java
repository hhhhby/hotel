package com.hby.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Boolean success;
    private String errorMsg;
    private Object data;
    private Long tatal;

    //响应成功
    public static Result ok(){
        return new Result(true,null,null,null);
    }
    //
    public static Result ok(Object data){
        return new Result(true,null,data,null);
    }
    //
    public static Result ok(List<?> data, Long total){
        return new Result(true,null,data,total);
    }
    //失败，返回消息
    public static Result fail(String errorMsg){
        return new Result(false,errorMsg,null,null);
    }


}
