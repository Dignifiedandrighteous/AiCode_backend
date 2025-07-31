package com.happy.aicode_backend.controller;

import com.happy.aicode_backend.common.BaseResponse;
import com.happy.aicode_backend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author happy
 * @version 1.0
 * @Date 2025/7/29
 * @Description TODO
 */

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success( "ok");
    }
}

