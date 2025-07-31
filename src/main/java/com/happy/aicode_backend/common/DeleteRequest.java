package com.happy.aicode_backend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author happy
 * @version 1.0
 * @Date 2025/7/29
 * @Description 删除包装类
 */

@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

