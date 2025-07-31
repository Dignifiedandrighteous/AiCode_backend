package com.happy.aicode_backend.common;

import com.happy.aicode_backend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author happy
 * @version 1.0
 * @Date 2025/7/29
 * @Description 通用响应类
 */

@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

