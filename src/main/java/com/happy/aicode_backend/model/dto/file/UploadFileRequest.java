package com.happy.aicode_backend.model.dto.file;

import lombok.Data;

import java.io.Serializable;

/**
 * @author happy
 * @version 1.0
 * @Date 2025/8/3
 * @Description 上传文件请求
 */

@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}