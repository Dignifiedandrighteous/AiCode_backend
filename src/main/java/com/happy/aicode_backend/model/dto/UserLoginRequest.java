package com.happy.aicode_backend.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author happy
 * @version 1.0
 * @Date 2025/8/2
 * @Description 用户登录请求
 */

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
