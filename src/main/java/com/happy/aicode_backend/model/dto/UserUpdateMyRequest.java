package com.happy.aicode_backend.model.dto;

import java.io.Serializable;

/**
 * @author happy
 * @version 1.0
 * @Date 2025/8/3
 * @Description 用户更新个人信息请求
 */

public class UserUpdateMyRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 简介
     */
    private String userProfile;

    private static final long serialVersionUID = 1L;
}
