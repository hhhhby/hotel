package com.hby.config;


import com.hby.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class WebExceptionAdvice {

    public Result handleRuntimeException(RuntimeException e){
        log.error(e.toString(),e);
        return Result.fail("服务器异常");
    }

}