package com.atguigu.cloud.resp;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author starlord
 * @description
 * @create 2024/10/31
 */

@Data
@Accessors(chain = true)
public class ResultData<T> {

    private T data;
    private String message;
    private String code;
    private long timestamp;

    public ResultData( ) {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ResultData<T> success (T t){
        ResultData<T> resultData = new ResultData<>();
        resultData.setData(t);
        resultData.setCode(ReturnCodeEnum.RC200.getCode());
        resultData.setMessage(ReturnCodeEnum.RC200.getMessage());
        return resultData;
    }

    public static <T> ResultData<T> fail(String code,String message){
        ResultData<T> resultData = new ResultData<>();
        resultData.setMessage(message);
        resultData.setCode(code);
        return resultData;
    }
}
