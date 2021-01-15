package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface HallApi {

    @GetMapping("/selectHallByUserId")
    Map<String,Object> selectHallByUserId(@RequestParam("userId") Integer userId);

}
