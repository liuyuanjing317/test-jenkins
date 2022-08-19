package com.lyj.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 大屏统计接口
 * @Description TODO
 * @Author Xuejian
 * @Date 2021/8/30 10:08
 */
@RestController
@RequestMapping("/jenkins")
@Slf4j
//@CrossOrigin
public class TestController {

    /**
     * 统计志愿者数量，团队数量，服务时长，实践所，实践站，阵地数量
     * @return
     */
    @PostMapping("/test")
    public Object test(){
        return "hello jenkins test";
    }

}
